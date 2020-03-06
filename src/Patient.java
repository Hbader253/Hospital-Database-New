import java.util.ArrayList;

public class Patient {
	int patientID;
	Name patientName = new Name(); 
	Date dob = new Date();
	String sex = "Undefined";  
	String insurance = "Undefined";
	String gP = "Undefined";      		//regular doctor. Maybe make this link to an instance of a staff class?
	ArrayList<String> allergies = new ArrayList<String>();
	ArrayList<String> conditions = new ArrayList<String>(); 
	public int getPatientID() {		//patient ID can't be changed 
		return patientID;
	}

	public Name getPatientName() {
		return patientName;
	}
	public void setPatientName(Name patientName) {
		this.patientName = patientName;
	}
	public Date getDob() {
		return dob;
	}	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getgP() {
		return gP;
	}
	public void setgP(String gP) {
		this.gP = gP;
	}
	public ArrayList<String> getAllergies() {
		return allergies;
	}
	public void setAllergies(ArrayList<String> allergies) {		//THIS REPLACES ENTIRE LIST!
		this.allergies = allergies;
	}
	public void addAllergie(String allergie) {
		this.allergies.add(allergie);
	}
	public void removeAllergie(int index) {
		this.allergies.remove(index);		
	}
	public ArrayList<String> getConditions() {
		return conditions;
	}
	public void setConditions(ArrayList<String> conditions) {	//THIS REPLACES ENTIRE LIST!
		this.conditions = conditions;
	}
	public void addCondition(String condition) {
		this.conditions.add(condition);
	}
	public void removeCondition(int index) {
		this.conditions.remove(index);
	}

	public Patient(int patientID) {
		this.patientID = patientID;
	}
	
	
}
