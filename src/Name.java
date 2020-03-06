
public class Name {
	private String firstName = "";		//if there are multiple, separate with space. If there are none, leave unassigned or empty.
	private String middleName = "";
	private String lastName = "";
	private String maidenName = "";
	private String nickName = "";
	private String suffix = "";			
	private String honorific = "";	
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getHonorific() {
		return honorific;
	}
	public void setHonorific(String honorific) {
		this.honorific = honorific;
	}	
	public String getMiddleInitial() {
		if(middleName.length() < 1) return "";
		return middleName.substring(0, 1);
	}
	
	public Name() {
		
	}

}
