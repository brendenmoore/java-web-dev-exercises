package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student brenden = new Student("Brenden Moore", 1, 1, 4.0);
        brenden.addGrade(3, 3.5);
        System.out.println(brenden.getGpa());
        System.out.println(brenden.getGradeLevel());
        System.out.println(brenden);
        brenden.addGrade(50, 3.8);
        System.out.println(brenden);
    }
}
