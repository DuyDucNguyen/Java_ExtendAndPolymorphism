
public class Student extends Person{
	private int id;
	
	// default constructor with initialized arg
	public Student(String n, int inputID) {
		super(n);
		this.id = inputID;
	}
	
	// default constructor without arg
	public Student() {
		this("Student", 0);
	}
	
	
	public int getSID() {
		return id;};
	
	// Overriding method
	public String toString() {
		return this.getSID() + ": " + super.toString();
	}
}
