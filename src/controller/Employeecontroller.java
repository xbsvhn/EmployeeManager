package controller;

import entity.Employee;
import service.EmployeeServiceImpl;
import service.IEmployeeService;

public class Employeecontroller {
    IEmployeeService service = new EmployeeServiceImpl();

    public boolean addEmployee(Employee employee) {
        return service.addEmplopyee(employee);
    }

    public boolean updateEmployee(int id, Employee employee) {
        return service.updateEmployee(id, employee);
    }

    public boolean deleteEmployee(int id) {
        return service.deleteEmployee(id);
    }

    public void showIntern() {
        service.showInfoIntern();
    }

    public void showExperience() {
        service.showInfoExperience();
    }

    public void showFresher() {
        service.showInfoFresher();
    }

    public int findEmployeeByid(int id){
        return service.findEmployee(id);
    }


}
