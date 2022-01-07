public class Staff 
extends Employee{

	private String title;
	
	//constructor
	public Staff(String ln, String fn, String mn, String a, 
					String e, String p, String o, double sa, String t)  {
	super (ln, fn, mn, a, e, p, o, sa);
	this.title = t;
	}
	
	//accessor
	public String gettitle() {
		return this.title;
	}
	
	//mutator
	public void settitle(String t) {
		this.title = t;
	}
	
	//toString
	public String toString() {
		String s;
		
		s = super.toString() + 
		"\nTitle:			" + this.title;
		
		return s;
	}
}
