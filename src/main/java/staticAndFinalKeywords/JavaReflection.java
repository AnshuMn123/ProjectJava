package staticAndFinalKeywords;

import java.lang.reflect.Method;

class Animal{
    void makeSound(){
        System.out.println("staticAndFinalKeywords.Animal make sound");
    }
}

class Dog extends Animal{
    void dogName(){
        System.out.println("dog have name");
    }
}
public class JavaReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Dog dog1 = new Dog();
        dog1.dogName();
        dog1.makeSound();

        // 1. getting class name
        Class Object = Dog.class;
        System.out.println("class name is " + Object + " " + Object.getName());
        Class Object1 = Object.getSuperclass();
        System.out.println("super class name " + Object1 + " " +  Object1.getName());

        // method 2 : getting class name
        Class obj = dog1.getClass();
        System.out.println("Obj " + obj );

        // method 3 : getting class name
        Class obj1 = Class.forName("staticAndFinalKeywords.Dog"); // this will throw exception of CNFE
        System.out.println("Obj1 " + obj1 );


        // for getting declared method
        Method[] method = Object.getDeclaredMethods();
        for(Method x : method){
            System.out.println("Methods : " +  x.getName());
        }
    }

}
