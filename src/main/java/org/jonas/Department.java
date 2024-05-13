package org.jonas;

public class Department {
    private String departmentId = "D";
    private String departmentName;
    private int nextId;

    public boolean validateDepartmentName(String departmentName) {
        for (int i = 0; i < departmentName.length(); i++) {
            if (!Character.isAlphabetic(departmentName.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
