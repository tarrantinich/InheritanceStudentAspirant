package com.company;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(String firstName, String lastName, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        if (averageMark < 5.0){
            return 1900;
        }else return 2000;
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %s", firstName, lastName, averageMark);
    }
}
