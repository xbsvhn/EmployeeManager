package entity;

import java.util.Date;
import java.util.List;

public class Intern extends Employee{
    private String majors;
    private String universityName;
    private int semester;

    public Intern(){

    }



    public Intern(int id, String fullName, Date birthday, String phone, String email, int employeeType, List<Certificate> certificates, String majors, String universityName, int semester) {
        super(id, fullName, birthday, phone, email, employeeType, certificates);
        this.majors = majors;
        this.universityName = universityName;
        this.semester = semester;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void showInfo() {
        System.out.println("Intern [majors=" + majors + ", semester=" + semester + ", universityName=" + universityName
                + ", getId()=" + getId() + ", getFullName()=" + getFullName() + ", getBirthDay()=" + getBirthday()
                + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getEmployeeType()="
                + getEmployeeType() + ", getEmployeeCount()=" + getEmployeeCount() + "]");
    }
}
