package entity;

import java.util.Date;
import java.util.List;

public class Fresher extends Employee {
    private Date graduationDate;
    private String graduationRank;
    private String schoolName;

    public Fresher(){

    }


    public Fresher(int id, String fullName, Date birthday, String phone, String email, int employeeType, List<Certificate> certificates, Date graduationDate, String graduationRank, String schoolName) {
        super(id, fullName, birthday, phone, email, employeeType, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.schoolName = schoolName;
    }

    public Fresher(Date graduationDate, String graduationRank, String schoolName) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.schoolName = schoolName;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void showInfo() {
        System.out.println("Fresher [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", education="
                + schoolName + ", getId()=" + getId() + ", getFullName()=" + getFullName() + ", getBirthDay()="
                + getBirthday() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getEmployeeType()="
                + getEmployeeType() + ", getEmployeeCount()=" + getEmployeeCount() + "]");
    }



}
