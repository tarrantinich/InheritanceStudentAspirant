package com.company;

public class Aspirant extends Student {
    
    public Aspirant(String firstName, String lastName, double averageMark) {
        super(firstName, lastName, averageMark);
    }

    @Override
    public int getScholarship() {
        if (this.averageMark < 5.0) {
            return 2200;
        } else return 2500;
    }
}
