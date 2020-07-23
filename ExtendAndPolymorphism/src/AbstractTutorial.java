// interface assume all method are abstract
// Contains only abstract methods
// cannot be instantiated
interface DogInterface {
	abstract void food(double weight);
	abstract void bark();
	abstract void poop();
}


// abstract class is a class that contains at least one abstract method
// abstract method is empty method, it's just an idea
// it can have common method
// can not be instantiated 
abstract class Dog{
	public void food(double weight) {
		double amount = 0.25 + weight*0.2;
		System.out.println("It eats " + amount + "(kg) of food per meal");
	}
	public abstract void bark();
	public abstract void poop();
}



class Chihuahua extends Dog{
	public void bark() {
		System.out.println("Bark!");
	}
	
	public void poop() {
		System.out.println("Chihuahua pooped!");
	}
}


class InuShiba extends Dog{
	@Override
	public void bark() {
		System.out.println("GrGrGr!");
	}

	@Override
	public void poop() {
		System.out.println("InuShiba pooped!");
	}
	
}

// Bulldog has 
class Bulldog implements DogInterface{
	public void food(double weight) {
		double amount = 0.25 + weight*0.3;
		System.out.println("It eats " + amount + "(kg) of food per meal");
	}
	public void bark() {
		System.out.println("GRGRGR!");
	};
	public void poop() {
		System.out.println("Bulldog pooped!");
	};
}

public class AbstractTutorial {
	public static void main(String[] args) {
		System.out.println("main file is running");
		// Dog d = new Dog(); //ERROR
		Chihuahua c = new Chihuahua();
		c.bark();
		c.poop();
		c.food(1.5);
		
		InuShiba i = new InuShiba();
		i.bark();
		i.poop();
		i.food(8);
		
		Bulldog b = new Bulldog();
		b.bark();
		b.poop();
		b.food(10);
	}
}
