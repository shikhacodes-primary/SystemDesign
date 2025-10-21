package lld.proxy;

public interface EmployeeDao {
    void createEmployee(String client, Employee employee) throws Exception;
    void deleteEmployee();
    void getEmployee(int employeeId);
}
