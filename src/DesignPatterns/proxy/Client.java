package DesignPatterns.proxy;

public class Client {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeProxyDao();
        try {
            employeeDao.createEmployee("ADMIN", new Employee(1, "Shikha"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
