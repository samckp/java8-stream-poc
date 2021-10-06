package edu.java8.poc;

abstract class demo{

    int a;
    demo(){
        a =10;
    }
    abstract void set(int a);
    abstract void get();
}
public class AbstrctDemo extends demo {

    @Override
    void set(int a) {
        this.a = a;
    }

    @Override
    void get() {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {

        AbstrctDemo  abstrctDemo = new AbstrctDemo();
        abstrctDemo.set(20);
        abstrctDemo.get();
    }
}
