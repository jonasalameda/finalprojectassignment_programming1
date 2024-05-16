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

    /**
     *checks if the sum of weights of all assignments of that course equals to `1 (100%)`
     * @return returns true if it's equals to 100%, otherwise false
     */
    public boolean isAssignmentWeightValid() {
        return false;
        //TODO: to be implemented
    }

    /**
     * adds a student to the student list of the course,
     * also add a new `null` element to each assignment of this course,
     * and add a new `null` element for the `finalScores`.
     * @param student parameter to be checked and/and not be added to the course's list
     * @return returns true if the student is not on the list, otherwise false
     */
    public boolean registerStudent(Student student) {
        return false;
        //TODO: to be implemented
    }

    /**
     * calculates the weighted average score of a student.
     * @return returns an array of the weighted average of a student
     */
    public int[] calcStudentAverage() {
        return new int[0];
        //TODO: to be implemented
    }

    /**
     * adds a new assignment to the course
     * @param assignmentName name of the assignment to be added
     * @param weight weight of the assignment
     * @param maxScore max score attained
     * @return returns true if the assignment can be added otherwise false
     */
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        return false;
        //TODO: to be implemented
    }

    /**
     * generates random scores for each assignment and student,
     * and calculates the final score for each student.
     */
    public void generateScore() {
        //TODO: to be implemented
    }

    /**
     * displays the scores of a course in a table,
     * with the assignment averages and student weighted average
     */
    public void displayScores() {
        //TODO: to be implemented
    }
}
