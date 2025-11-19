package coreJavaRefresher.inheritance;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Dog is barking!!!");
    }

    public void bark(){
        System.out.println("woof woof!!!!");
    }

}
