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
    //TODO: ArrayList<Course> registeredCourses
    private static int nextId;

    //TODO: registerCourse

    //TODO: dropCourse
}
