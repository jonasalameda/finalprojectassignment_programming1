package org.jonas;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId = 1;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        departmentId = String.format("D%02d", nextId++);
    }

    /**
     * checks if a department name is valid or not,
     * a department name should only contain letters or space
     * @param departmentName String of the name of the department
     * @return returns true if its valid, otherwise false
     */
    public boolean validateDepartmentName(String departmentName) {
        for (int i = 0; i < departmentName.length(); i++) {
            if (!Character.isAlphabetic(departmentName.charAt(i))) {
                System.out.println("department name is not valid");
                return false;
            }
        }
        System.out.println("department name is valid");
        return true;
    }
}
