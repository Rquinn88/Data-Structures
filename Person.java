public class Person {
	
	private String firstname, lastname, middlename;
	private String address;
	private String phonenumber;
	private String emailaddress;
	
	//constructor
	public Person (String ln, String fn, String mn, String a, String e, String p){
		this.firstname = fn;
		this.lastname = ln;
		this.middlename = mn;
		this.address = a;
		this.phonenumber = p;
		this.emailaddress = e;
	}
	
	//accessors
	public String getlastname() {
		return this.lastname;
	}
	
	public String getfirstname() {
		return this.firstname;
	}
	
	public String getmiddlename() {
		return this.middlename;
	}
	
	public String getaddress() {
		return this.address;
	}
	
	public String getphonenumber() {
		return this.phonenumber;
	}
	
	public String getemailaddress() {
		return this.emailaddress;
	}
	
	//mutators
	public void setlastname(String ln) {
		this.lastname = ln;
	}
	
	public void setfirstname(String fn) {
		this.firstname = fn;
	}
	
	public void setmiddlename(String mn) {
		this.middlename = mn;
	}
	
	public void setaddress(String a) {
		this.address = a;
	}
	
	public void setphonenumber(String p) {
		this.phonenumber = p;
	}
	
	public void setemailaddress(String e) {
		this.emailaddress = e;	
	}
	
	//toString
	public String toString(){
		String s;
		
		s = "Last Name:		" + getlastname() + "\n" +
			"First Name:		" + getfirstname() + "\n" +
			"Middle Name:		" + getmiddlename() + "\n" +
			"Address:		" + getaddress() + "\n" +
			"Phone Number:		" + getphonenumber() + "\n" +
			"Email Address:		" + getemailaddress() + "\n";
		
		return s;
	}
	
	 
	 
}