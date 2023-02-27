package com.company;

public class Aspirant extends Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Aspirant(String firstName, String lastName, double averageMark) {
        super(firstName, lastName, averageMark);
    }

    @Override
    public int getScholarship() {
        if (averageMark < 5.0) {
            return 2200;
        } else return 2500;
    }
}
