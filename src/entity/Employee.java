package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Employee {

    private static int employeeCount = 0;

    private int id;
    private String fullName;
    private Date birthday;
    private String phone;
    private String email;
    private int employeeType;

    private List<Certificate> certificates = new ArrayList<>();

    public Employee(int id, String fullName, Date birthday, String phone, String email, int employeeType, List<Certificate> certificates) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;

        this.employeeType = employeeType;
        this.certificates = certificates;

        employeeCount++;
    }

    public Employee() {
        employeeCount++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public abstract void showInfo();
}
