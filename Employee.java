public class Employee extends Person{

	private double salary;
	private String office;
	
	public static final double MIN_SALARY = 20000.00;
	public static final double INVALID_SALARY = -1.0;
	
	//constructor
	public Employee(String ln, String fn, String mn, 
					String a, String e, String p, String o, double sa )  {
	super (ln, fn, mn, a, e, p);
	this.salary = sa;
	this.office = o;
	}
	//accessors
	public String getoffice() {
		return this.office;
	}
	
	public double getsalary() {
		return this.salary;
	}
	
	//mutators
	public void setsalary(double sa) {
		this.salary = sa;
	}
	
	public void setoffice(String o) {
		this.office = o;
	}
		
	//toString
	public String toString() {
		String s;
		
		s = super.toString() + 
		"\nSalary:			" + this.salary + 
		"\nOffice:			" + this.office;
		
		return s;
	}
}
