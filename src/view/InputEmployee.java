package view;

import HandlingException.HandleException;
import entity.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InputEmployee {



    public Employee input(){


        while (true) {
            System.out.println("Id: ");
            int id = HandleException.inputInt("Ban phai nhap so, moi nhap lai!");
            System.out.println("Fullname: ");
            String fullName = HandleException.inputName();
            System.out.println("BirthDay: ");
            Date birthDay = HandleException.inputBirthDay();
            System.out.println("Phone: ");
            String phone = HandleException.inputString("Phone khong duoc de trong, moi nhap lai!");
            System.out.println("Email: ");
            String email = HandleException.inputEmail();
            List<Certificate> listCertificate = enterCertificate();

            System.out.println("EmployeeType: (0: Experience, 1: Fresher , 2: Intern)");
            int choose = HandleException.inputInt("Ban phai nhap so, moi nhap lai!");
            switch (choose) {
                case 0:
                    System.out.println("So nam kinh nghiem: ");
                    int expInYear = HandleException.inputInt("Ban phai nhap so, moi nhap lai!");
                    System.out.println("Ky nang chuyen mon: ");
                    String proSkill = HandleException.inputString("Proskill khong duoc de trong, moi nhap lai!");

                    Employee exp = new Experience(id, fullName, birthDay, phone, email, choose, listCertificate, expInYear,
                            proSkill);
                    return exp;
                case 1:
                    System.out.println("Thoi gian tot nghiep: ");
                    Date graduationDate = HandleException.inputBirthDay();
                    System.out.println("Xep loai tot nghiep: ");
                    String graduationRank = HandleException.inputString("Rank khong duoc de trong, moi nhap lai!");
                    System.out.println("Truong tot nghiep: ");
                    String education = HandleException.inputString("Education khong duoc de trong, moi nhap lai!");

                    Employee fresher = new Fresher(id, fullName, birthDay, phone, email, 1, listCertificate, graduationDate,
                            graduationRank, education);
                    return fresher;
                case 2:
                    System.out.println("Chuyen nganh dang hoc: ");
                    String major = HandleException.inputString("Major khong duoc de trong, moi nhap lai!");
                    System.out.println("Hoc ki dang hoc: ");
                    int semester = HandleException.inputInt("Semester khong duoc de trong, moi nhap lai!");
                    System.out.println("Ten truong dang hoc: ");
                    String universityName = HandleException.inputString("University khong duoc de trong, moi nhap lai!");

                    Employee intern = new Intern(id, fullName, birthDay, phone, email, 2, listCertificate, major,
                            universityName, semester);
                    return intern;
                default:
                    System.out.println("Ban da nhap sai, moi nhap lai!");
                    break;

            }
        }

    }

    private  List<Certificate> enterCertificate(){
        List<Certificate> listCertificate = new ArrayList<>();
        System.out.println("So luong certificate: ");
        int number = HandleException.inputInt("Ban da nhap sai, moi nhap lai");
        for (int i = 0; i < number; i++) {
            System.out.println("Certificate Id: ");
            int certificateId = HandleException.inputInt("Ban da nhap sai, moi nhap lai");
            System.out.println("Certificate Name: ");
            String certificateName = HandleException.inputString("Name khong duoc de trong, moi nhap lai");
            System.out.println("Certificate Rank: ");
            String certificateRank = HandleException.inputString("Rank khong duoc de trong, moi nhap lai");
            System.out.println("Certificate Date: ");
            Date certificateDate = HandleException.inputBirthDay();

            Certificate ce = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
            listCertificate.add(ce);
        }

        return listCertificate;
    }
}
