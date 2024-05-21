package org.jonas;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private ArrayList<Course> registeredCourses;
    private static int nextId = 1;

    public Student(String studentName, Gender gender, Address address, Department department) {
        this.registeredCourses = new ArrayList<>();
        this.studentId = String.format("S%06d", nextId++);
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.department = department;
    }

    /**
     * registers a course, add the course to the student's registeredCourses list, and add the student to the course's
     * registeredStudents list. If the course is already registered, directly returns `false`
     * @param course parameter to have a new student or not
     * @return returns true if the student hasnt registered in that course yet
     * and adds the course to the student's registered courses
     * otherwise, if the course is already registered, returns false
     */
    public boolean registerCourse(Course course) {
        for (Course existingCourse : registeredCourses) {
            if (existingCourse.getCourseName().equals(course.getCourseName())) {
                return false;
            }
        }
        course.getStudents().add(this);
        registeredCourses.add(course);
        for (Assignment assignment : course.getAssignments()) {
            assignment.getScores().add(null);
        }
        return true;
    }

    /**
     * drops a course, remove the course from the student's registeredCourses list,
     * and remove the student from the course's registeredStudents list.
     * If the course is not registered yet, directly returns `false`
     * @param course course's id to be dropped
     * @return returns true if the course is registered and
     * removes that course from student's registered courses
     * otherwise, if the course is not registered returns false.
     */
    public boolean dropCourse(Course course) {
        for (Course existingCourse : registeredCourses) {
            if (!existingCourse.getCourseName().equals(course.getCourseName())) {
                return false;
            }
        }
        course.getStudents().remove(this);
        registeredCourses.remove(course);
        for (Assignment assignment : course.getAssignments()) {
            assignment.getScores().remove(null);
        }
        return true;
    }
}
