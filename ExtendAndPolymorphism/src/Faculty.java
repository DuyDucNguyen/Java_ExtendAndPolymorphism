
public class Faculty extends Person{
	private String id;
	
	// default constructor with initialized arg
	public Faculty(String n, String inputID) {
		super(n);
		this.id = inputID;
	}
		
	// default constructor without arg
	public Faculty() {
		this("Faculty", "AAA");
	}
	
	public String getFID() {
		return id;};
	
	// Overriding method
	public String toString() {
		return this.getFID() + ": " + super.toString();
	}
	
	
}
