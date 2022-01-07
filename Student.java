public class Student extends Person{

	private int status;
	private String program;
	private String strStatus;
	
	public static final int STATUS_FRESHMAN = 1;
	public static final int STATUS_SOPHOMRE = 2;
	public static final int STATUS_JUNIOR = 3;
	public static final int STATUS_SENIOR = 4;
	public static final int NON_MATRICULATED = 0;
	public static final int STATUS_NOT_VALID = -1;
	
	//constructor
	public Student(String ln, String fn, String mn, String a, String e, String p, int st, String pr)  {
	super (ln, fn, mn, a, e, p);
	this.status = st;
	this.program = pr;
	
	//changes intStatus to stringStatus
		if(status == STATUS_FRESHMAN){
			strStatus = "Freshman";
		}
		else if(status == STATUS_SOPHOMRE){
			strStatus = "Sophomore";
		}
		else if(status == STATUS_JUNIOR){
			strStatus = "Junior";
		}
		else if(status == STATUS_SENIOR){
			strStatus = "Senior";
		}
		else if(status == NON_MATRICULATED){
			strStatus = "Non-Matriculated";
		}
		else if(status == STATUS_NOT_VALID){
			strStatus = "Junior";
		}
	}
	
	//accessors
	public String getstatus() {
		return strStatus;
	}
	
	public String getprogram() {
		return this.program;
	}
	
	//mutators
	public void setstatus(int st) {
		this.status = st;
	}
	
	public void setprogram(String pr) {
		 this.program = pr;
	}
	
	//toString
	public String toString() {
		String s;
		
		s = super.toString() + 
		"\nStatus:			" + getstatus() +
		"\nProgram:		" + getprogram();
		
		return s;
	}
}