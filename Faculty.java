public class Faculty 
extends Employee {

	private String officehours;
	private String rank;
	
	//constructor
	public Faculty(String ln, String fn, String mn, String a, 
					String e, String p, String o, double sa, String oh, String ra) {
	super (ln, fn, mn, a, e, p, o, sa);
	this.officehours = oh;
	this.rank = ra;
	}
	
	//accessors
	public String getofficehours() {
		return this.officehours;
	}
	
	public String getrank() {
		return this.rank;
	}
	
	//mutators
	public void setofficehours(String oh) {
		this.officehours = oh;
	}
	
	public void setrank(String ra) {
		this.rank = ra;
	}
		
	//toString
	public String toString() {
		String s;
		
		s = super.toString() + 
		"\nOffice Hours:		" + this.officehours + 
		"\nRank:			"  + this.rank;
		
		return s;
	}
}
