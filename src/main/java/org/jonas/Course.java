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

    public Course(String courseName, double credits, Department department) {
        this.courseId = String.format("C-D%02d-%02d", nextId, nextId++);
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
        this.assignments = new ArrayList<>();
        this.students = new ArrayList<>();
        this.finalScores = new ArrayList<>();
    }

    /**
     *checks if the sum of weights of all assignments of that course equals to `1 (100%)`
     * @return returns true if it's equals to 100%, otherwise false
     */
    public boolean isAssignmentWeightValid() {
        int sum = 0;
        for (Assignment assignment : assignments) {
            sum += (int) assignment.getWeight();
        }
        return sum > 100;
    }

    /**
     * adds a student to the student list of the course,
     * also add a new `null` element to each assignment of this course,
     * and add a new `null` element for the `finalScores`.
     * @param student parameter to be checked and/and not be added to the course's list
     * @return returns true if the student is not on the list, otherwise false
     */
    public boolean registerStudent(Student student) {
        for (Student registeredStudent : students) {
            if (registeredStudent.equals(student)) {
                return false;
            }
        }

        for (Assignment assignment : assignments) {
            assignment.getScores().add(null);
        }
        students.add(student);
        finalScores.add(null);
        return true;
    }

    /**
     * calculates the weighted average score of all students.
     * weight * score
     */
    public void calcStudentsAverage() {
        for (int i = 0; i < students.size(); i++) {
            double avg = 0;

            for (Assignment assignment : assignments) {
                avg += assignment.getScores().get(i) * assignment.getWeight();
            }
            finalScores.set(i, avg);
        }
    }

    /**
     * adds a new assignment to the course
     * @param assignmentName name of the assignment to be added
     * @param weight weight of the assignment
     * @param maxScore max score attained
     * @return returns true if the assignment can be added otherwise false
     */
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        for (Assignment existingAssignment : assignments) {
            if (existingAssignment.getAssignmentName().equals(assignmentName)) {
                return false;
            }
        }

        Assignment assignment = new Assignment(assignmentName, weight, maxScore, students.size());
        assignments.add(assignment);
        return true;
    }

    /**
     * generates random scores for each assignment and student,
     * and calculates the final score for each student.
     */
    public void generateScore() {
        for (Assignment assignment : assignments) {
            assignment.generateRandomScore();
        }
        calcStudentsAverage();
    }

    /**
     * displays the scores of a course in a table,
     * with the assignment averages and student weighted average
     */
    public void displayScores() {
        System.out.printf("%nCourse: %s(%s)%n", courseName, courseId);

        // header
        System.out.printf("%15s", "");
        for (Assignment assignment : assignments) {
            System.out.printf("%15s", assignment.getAssignmentName());
        }
        System.out.printf("%15s\n", "Final Score");

        // scores
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%15s", students.get(i).getStudentName());
            for (Assignment assignment : assignments) {
                System.out.printf("%15s",  assignment.getScores().get(i));
            }
            System.out.printf("%15s\n",  getFinalScores().get(i));
        }

        System.out.printf("%15s", "Average");

        // average
        for (Assignment assignment : assignments) {
            System.out.printf("%15s", assignment.getAssignmentAverage());
        }

    }

    public String simplifiedToString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department.getDepartmentName() +
                '}';
    }

    @Override
    public String toString() {
        String str =  "Course{" +
                "\n\tcourseId='" + courseId + '\'' +
                "\n\tcourseName='" + courseName + '\'' +
                "\n\tcredits=" + credits +
                "\n\tdepartment=" + department.getDepartmentName() +
                "\n\tassignments=[";

        for (Assignment assignment : assignments) {
            str += "\n\t\t" + assignment + ",";
        }
        str += "\n\t]";

        str += "\n\tstudents=[";
        for (Student student : students) {
            str += "\n\t\t" + student.simplifiedToString() + ",";
        }
        str += "\n\t]";
        return str;
    }
}
