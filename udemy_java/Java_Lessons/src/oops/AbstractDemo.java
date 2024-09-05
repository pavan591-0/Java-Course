package oops;

//Abstract class representing a general concept of an Animal
abstract class Animal {
 
 // Abstract method (does not have a body)
 // This method must be implemented by any non-abstract subclass
 abstract void makeSound();
 
 // Concrete method (has a body)
 // This method can be used as is or overridden by subclasses
 void sleep() {
     System.out.println("This animal is sleeping.");
 }
}

//Concrete class inheriting from the abstract class Animal
class Dog extends Animal {
 
 // Implementation of the abstract method makeSound()
 @Override
 void makeSound() {
     System.out.println("The dog says: woof woof");
 }
}

//Another concrete class inheriting from the abstract class Animal
class Cat extends Animal {
 
 // Implementation of the abstract method makeSound()
 @Override
 void makeSound() {
     System.out.println("The cat says: meow");
 }
}

public class AbstractDemo {
 public static void main(String[] args) {
     
     // Creating objects of Dog and Cat
     Animal dog = new Dog();
     Animal cat = new Cat();
     
     // Calling the makeSound() method on Dog and Cat objects
     dog.makeSound(); // Outputs: The dog says: woof woof
     cat.makeSound(); // Outputs: The cat says: meow
     
     // Calling the sleep() method on Dog and Cat objects
     dog.sleep(); // Outputs: This animal is sleeping.
     cat.sleep(); // Outputs: This animal is sleeping.
 }
}
