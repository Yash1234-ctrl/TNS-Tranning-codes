package com.day5;

class Student {
    private int rollNo;
    private String collegeName;

    public Student() {}

    public Student(int rollNo, String collegeName) {
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}

public class Citizen extends Student {
    private String name;
    private long aadhaarNo;
    private String address;
    private long phoneNo;

    public Citizen() {}

    public Citizen(String name, long aadhaarNo, String address, long phoneNo, int rollNo, String collegeName) {
        super(rollNo, collegeName);
        this.name = name;
        this.aadhaarNo = aadhaarNo;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(long aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Aadhaar No: " + getAadhaarNo());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone No: " + getPhoneNo());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("College Name: " + getCollegeName());
    }

    public static void main(String[] args) {
        Citizen c = new Citizen();
        c.setName("Yash");
        c.setAadhaarNo(987654321098L);
        c.setAddress("Pune");
        c.setPhoneNo(9876543210L);
        c.setRollNo(101);
        c.setCollegeName("JSPM Pune");
        c.displayDetails();
    }
}
