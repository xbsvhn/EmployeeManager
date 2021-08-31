package service;

import entity.Employee;

public interface IEmployeeService {

    boolean addEmplopyee(Employee newEmployee);
    boolean updateEmployee(int id, Employee newEmployee);
    boolean deleteEmployee(int id);
    void showInfoFresher();
    void showInfoExperience();
    void showInfoIntern();
    int findEmployee(int id);
}
