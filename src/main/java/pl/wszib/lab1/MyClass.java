package pl.wszib.lab1;

public class MyClass {
    public String name;
    protected String name1;
    String name2;
    private String name3;

    public static String staticName;
    public static String staticName2;

    public void Print(){
        System.out.println("Name: " + name);
        System.out.println("Name1: " + name1);
        System.out.println("Name2: " + name2);
        System.out.println("Name3: " + name3);
        System.out.println("Static name: " + staticName + "\n");
    }

    public static void PrintStatic(){
        System.out.println("Static name: " + staticName);
        System.out.println("Static name: " + staticName2 + "\n");
    }
}
