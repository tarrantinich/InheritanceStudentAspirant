package com.company;

public class Main {

    public static void main(String[] args) {
        Student students[] = new Student[6];
        students[0] =new Student("Андрей", "Андреев", 3.6);
        students[1] =new Student("Иван", "Иванов", 5.0);
        students[2] =new Aspirant("Сергей", "Сергеев", 5.0);
        students[3] =new Student("Пётр", "Петров", 4.1);
        students[4] =new Aspirant("Максим", "Максимов", 4.3);
        students[5] =new Student("Вася", "Пупков", 5.0);
        for (int i =0; i < students.length; i++){
           int stipend = students[i].getScholarship();
           System.out.println(students[i] + ", стипендия равна " + stipend);
        }
    }
}
