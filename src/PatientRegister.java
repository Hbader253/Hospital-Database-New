import java.util.TreeMap;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PatientRegister {
	private Map<Integer,Patient> register = new TreeMap<Integer,Patient>();	//int is patient ID number
	private String title;
	public Map<Integer, Patient> getRegister() {
		return register;
	}

	public void setRegister(Map<Integer, Patient> register) {
		this.register = register;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public PatientRegister(String title) {	
		this.title = title;
	}
	
	public int newNumber() {		//TODO find unassigned number for a new patient	
		for(int i = 1; true; i++) {
			if(!register.containsKey(i)) return i;
		}
	}
	
	
public void addPatients(File input) throws IOException {
		
	Scanner filescanner = new Scanner(new FileReader(input));
	filescanner.nextLine();
	String row;
	while(filescanner.hasNext()) {	
		row = filescanner.nextLine();	
		Patient currentPatient = new Patient(newNumber());
		String[] patientData = row.split(",");
		Name patientName = new Name();
		patientName.setFirstName(patientData[0]);
		patientName.setLastName(patientData[1]);
		String[] dobTemp = patientData[2].split("/");
		Date dob = new Date();
		dob.setMonth(Integer.parseInt(dobTemp[0]));
		dob.setDay(Integer.parseInt(dobTemp[1]));
		dob.setYear(Integer.parseInt(dobTemp[2]));
		currentPatient.setPatientName(patientName);
		currentPatient.setDob(dob);
		currentPatient.setSex(patientData[4]);
		currentPatient.setInsurance(patientData[6]);
		currentPatient.setgP(patientData[7]);
		currentPatient.addCondition(patientData[9]);
		for(int i = 10; i < patientData.length; i++) {
			if(!patientData[i].contains("-negative") && !patientData[i].contains("-positive")) {
				currentPatient.addAllergie(patientData[i]);
			} else {
				currentPatient.setBloodType(patientData[i]);
			}
		}
		addPatient(currentPatient);
	}
	filescanner.close();
}
	
	public void addPatient(Patient newPatient) {
		register.put(newPatient.getPatientID(), newPatient);
	}
	
	
	//TODO put methods used to find here 
	public Set<Patient> findBloodType(String type) {
		Set<Patient> compatibles = new HashSet<Patient>();
		for(Patient p: register.values()) {
			if(p.getBloodType().equals(type)) compatibles.add(p);
		}
		return compatibles;
	}
	
}
