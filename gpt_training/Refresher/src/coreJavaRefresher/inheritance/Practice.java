package coreJavaRefresher.inheritance;

public class Practice {

    public static void main(String[] args){
        Animal a = new Dog();
        a.makeSound();
        // a.bark(); // error

        Dog d = new Dog();
        d.makeSound();
        d.bark();
    }

}
