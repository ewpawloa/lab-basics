package pl.wszib.lab1;

import myPackage.MyExtendedClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world\n");

        var myClass = new MyClass();
        myClass.name = "Elo";
        myClass.name1 = "Elo";
        myClass.name2 = "320";

        var myExtendedClass = new MyExtendedClass();

        MyClass.staticName = "Static name";
        myClass.Print();
        myExtendedClass.Print();
        MyClass.PrintStatic();
    }
}
