package com.constructure;

public class Constructure {
    private String name;
    private int age;

    public Constructure(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
    	Constructure s1 = new Constructure("Yash", 21);
        s1.display();

        s1.setName("Aarav");
        s1.setAge(22);
        s1.display();
    }
}
