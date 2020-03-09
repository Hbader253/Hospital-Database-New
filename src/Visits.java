
public class Visits {
	Date date = new Date();
	Date release = new Date();
	String hospitalID = "";
	String summary = "";	
	String notes = "";
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getRelease() {
		return release;
	}
	public void setRelease(Date release) {
		this.release = release;
	}
	public String getHospitalID() {
		return hospitalID;
	}
	public void setHospitalID(String hospitalID) {
		this.hospitalID = hospitalID;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	//TODO add more parameters 
	public Visits(Date date){
		this.date = date;
	}
}
