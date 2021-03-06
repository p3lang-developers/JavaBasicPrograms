package staticKeyword;

class Dog extends Animal {
	static void doStuff() {
		System.out.println("world");
	}

	public static void main(String args[]) {
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (int x = 0; x < a.length; x++) {
			a[x].doStuff(); // invoke the static method
		}
		Dog.doStuff(); // invoke using the class name
	}
}