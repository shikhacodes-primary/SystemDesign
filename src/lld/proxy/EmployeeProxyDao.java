package lld.proxy;

public class EmployeeProxyDao implements EmployeeDao {

    EmployeeDao employeeDao;
    public EmployeeProxyDao() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String empType, Employee employee) throws Exception {
        if (empType.equalsIgnoreCase("ADMIN")) {
            employeeDao.createEmployee(empType, employee);
        } else {
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public void getEmployee(int employeeId) {

    }
}
