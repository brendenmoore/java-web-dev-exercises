package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa) {
        this.name = aName;
        this.studentId = aStudentId;
        this.numberOfCredits = aNumberOfCredits;
        this.gpa = aGpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGradeLevel() {
        if (numberOfCredits <= 29) { return "Freshman"; }
        else if (numberOfCredits <= 59) { return "Sophomore"; }
        else if (numberOfCredits <= 89) { return "Junior"; }
        else { return "Senior"; }
    }

    public void addGrade(int numOfNewCredits, double grade) {
        double currentTotalQuality = gpa * numberOfCredits;
        currentTotalQuality += numOfNewCredits * grade;
        numberOfCredits += numOfNewCredits;
        gpa = currentTotalQuality / numberOfCredits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                ", gradeLevel=" + this.getGradeLevel() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                numberOfCredits == student.numberOfCredits &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }
}