package org.jonas;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("progrAmming1", 2, new Department("CST"));
        course.addAssignment("AssIgnment1", 0.2, 100);
        course.addAssignment("AssiGnment2", 0.2, 100);
        course.addAssignment("AssignMENt3", 0.6, 100);
        Student student = new Student("Dog", Gender.MALE, new Address(5, "x","x","x","x","H8N 3B3"), new Department("Cst"));
        student.registerCourse(course);
        Student student2 = new Student("Cat", Gender.MALE, new Address(5, "x","x","x","x","H8N2L4"), new Department("Cst"));
        student2.registerCourse(course);
        System.out.println(student);
    }
}
