package org.jonas;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@EqualsAndHashCode
@Getter
@Setter
public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> students;
    private ArrayList<Double> finalScores;
    private static int nextId = 1;

    public boolean isAssignmentWeightValid() {
        return false;
        //TODO: to be implemented
    }

    public boolean registerStudent(Student student) {
        return false;
        //TODO: to be implemented
    }

    public int[] calcStudentAverage() {
        return new int[0];
        //TODO: to be implemented
    }

    public boolean addAssignment(String assignment, double weight, int maxScore) {
        return false;
        //TODO: to be implemented
    }

    public void generateScore() {
        //TODO: to be implemented
    }

    public void displayScores() {
        //TODO: to be implemented
    }
}
