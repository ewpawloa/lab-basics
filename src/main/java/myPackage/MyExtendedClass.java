package myPackage;

import pl.wszib.lab1.MyClass;

public class MyExtendedClass extends MyClass {
    @Override
    public void Print(){
        super.name = "Extended name";
        super.name1 = "Extended name 2";
        super.Print();
    }
}
