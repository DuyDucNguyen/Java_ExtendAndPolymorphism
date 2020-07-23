// Overloading: Same class has same method name with different parameters
// Overriding: Subclass has same method name with the same parameters as the superclass
// "Think like a compiler, act like a runtime environment" - Rick Ord


public class Example {
	//static Person p = new Person();
	
	public static void main(String[] args) {
		System.out.println("\n### Person Example ###");
		Person p = new Person("Duy Duc NGUYEN"); 
		Person p1 = new Person();
		System.out.println(p.getName());
		System.out.println(p1.getName());
		
		
		System.out.println("\n### Student Example ###");
		Student s = new Student("Cara", 1234);
		Student s1 = new Student();
		System.out.println(s.getName());
		System.out.println(s.toString());
		System.out.println(s);
		System.out.println(s1.getName());
		System.out.println(s1.toString());
		System.out.println(s1);
		
		
		System.out.println("\n### Faculty Example ###");
		Faculty f = new Faculty("Mia", "ABCD");
		System.out.println(f);
	
		
		// List
		// Person references point to Student Object, Faculty Object  
		System.out.println("\n### List Example ###");
		Person plist[] = new Person[3];
		plist[0] = new Person("Tim");
		plist[1] = new Student("Cara", 1234);
		plist[2] = new Faculty("Mia", "ABCD");
		
		// Polymorphism: toString methods are called accordingly to classes
		for(int i=0; i<plist.length; i++) {
			System.out.println(plist[i]);
		}
		
		// example of Compile  Time vs Run Time
		plist[1].toString();
		//plist[1].getSID(); //Compiler ERROR: Compiler looks at Person class and it could not find getSID method
		//Solution: Casting Objects
		
		// Casting
		((Student) plist[1]).getSID();
		
		// instanceof
		if (plist[1] instanceof Student) {
			((Student) plist[1]).getSID();
		}
		
		
	}
}

