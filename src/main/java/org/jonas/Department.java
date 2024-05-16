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

    public boolean validateDepartmentName(String departmentName) {
        for (int i = 0; i < departmentName.length(); i++) {
            if (!Character.isAlphabetic(departmentName.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
