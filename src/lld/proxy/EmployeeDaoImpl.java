package lld.proxy;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void createEmployee(String client, Employee employee) throws Exception {
        System.out.println("employee created");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("employee deleted");
    }

    @Override
    public void getEmployee(int employeeId) {
        System.out.println("fetched employee");
    }
}
