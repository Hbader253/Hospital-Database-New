import java.util.HashMap;
import java.util.Map;

public class PatientRegister {
	Map<Integer,Patient> register = new HashMap<Integer,Patient>();	//int is patient ID number
	String title;
	
	public PatientRegister(String title) {	
		this.title = title;
	}
	
	public int newNumber() {		//TODO find unassigned number for a new patient	
		for(int i = 1; true; i++) {
			if(!register.containsKey(i)) return i;
		}
	}
	
	
	//TODO put methods used to find here 
	
	
}
