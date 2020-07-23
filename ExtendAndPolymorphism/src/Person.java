public class Person {
	private String name;
	
	// default constructor with initialized arg
	public Person(String n) {
		super();
		this.name = n;
	}
	
	// default constructor without arg
	public Person() {
		this("Person");
	}
	
	public String getName() {
		return name;}
	
	public void setName(String inputName) {
		this.name = inputName;}
	
	public String toString() {
		return this.getName();
	}
}
