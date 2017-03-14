package week2;
//using inheritance concept extending properties of Animal class in Bird class

public class Solution {
	public static void main(String[] args) {
		new Bird().walk();// nameless object creation
		new Bird().fly();
		new Bird().sing();

		// Bird bird = new Bird();//named object creation
		// bird.walk();
		// bird.fly();
	}
}

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}
