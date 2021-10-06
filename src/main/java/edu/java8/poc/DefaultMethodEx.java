package edu.java8.poc;

class Parent{

    public void greet(){
        System.out.println("Hello from Parent class method !!");
    }
}
interface Test{

    public default void greet(){
        System.out.println("Hello from Test interface default method !!");
    }

    static void hello(){
        System.out.println("hello from Test interface static method !!");
    }
}
interface Test1 {

    public default void greet(){
        System.out.println("Hello from Test1 interface default method !!");
    }
    static void hello(){
        System.out.println("hello from Test1 interface static method !!");
    }
}
public class DefaultMethodEx extends Parent implements Test , Test1{

    public void greet(){

        super.greet();
        Test.super.greet();
        Test1.super.greet();
    }

    public static void main(String[] args) {

        new DefaultMethodEx().greet();

        Test.hello();
        Test1.hello();
    }
}
