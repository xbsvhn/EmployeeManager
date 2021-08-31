package entity;

import java.util.Date;
import java.util.List;

public class Experience extends Employee {

    private int expInYear;
    private String proSkill;

    public Experience(){
        super();

    }

    public Experience(int id, String fullName, Date birthday, String phone, String email, int employeeType, List<Certificate> certificates, int expInYear, String proSkill) {
        super(id, fullName, birthday, phone, email, employeeType, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }






    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }


    @Override
    public void showInfo() {

        System.out.println("Experience [expInYear=" + expInYear + ", proSkill=" + proSkill + ", getId()=" + getId()
                + ", getFullName()=" + getFullName() + ", getBirthDay()=" + getBirthday() + ", getPhone()=" + getPhone()
                + ", getEmail()=" + getEmail() + ", getEmployeeType()=" + getEmployeeType() + ", getEmployeeCount()="
                + getEmployeeCount()+ "]");

    }




}
