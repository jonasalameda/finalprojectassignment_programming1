package org.jonas;

public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId = 1;

    public Department(String departmentName) {
        this.departmentName = departmentName;
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
