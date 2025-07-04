package com.daythree;

public class EncapsulationDemo  {
    private int serialNum;
    private String name;
    private int age;

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Serial Number: " + serialNum + ", Name: " + name + ", Age: " + age;
    }
}
