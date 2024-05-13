package org.jonas;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String studentId = "s";
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private ArrayList<Course> registeredCourses;
    private static int nextId = 1;

    /**
     * registers a course, add the course to the student's registeredCourses list, and add the student to the course's
     * registeredStudents list. If the course is already registered, directly returns `false`
     * @param course
     * @return returns true if the student hasnt registered in that course yet
     * and adds the course to the student's registered courses
     * otherwise, if the course is already registered, returns false
     */
    public boolean registerCourse(String course) {
        return false;
        //TODO: to be implemented
    }

    /**
     * drops a course, remove the course from the student's registeredCourses list,
     * and remove the student from the course's registeredStudents list.
     * If the course is not registered yet, directly returns `false`
     * @param courseId course's id to be dropped
     * @return returns true if the course is registered and
     * removes that course from student's registered courses
     * otherwise, if the course is not registered returns false.
     */
    public boolean dropCourse(String courseId) {
        return false;
        //TODO: to be implemented
    }
}
