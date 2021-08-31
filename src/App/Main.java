package App;

import HandlingException.HandleException;
import controller.Employeecontroller;
import entity.Employee;
import view.InputEmployee;

public class Main {
    public static void main(String[] args) {
        Employeecontroller employeecontroller = new Employeecontroller();
        menu();
        while (true){
            System.out.println("============");
            System.out.println("Moi ban chon: ");
            int choose = HandleException.inputInt("ban da nhap sai, moi nhap lai");
            switch (choose){
                case 1:
                    System.out.println("Add");
                    Employee employee = new InputEmployee().input();
                    if(employeecontroller.addEmployee(employee)){
                        System.out.println("Them thanh cong!");
                    }else {
                        System.out.println("Them khong thanh cong");
                    }
                    break;

                case 2:
                    System.out.println("Update");
                    System.out.println("Nhap ID can sua: ");
                    int id = HandleException.inputInt("Ban da nhap sai, moi nhap lai!");

                    if (employeecontroller.findEmployeeByid(id) == -1){
                        System.out.println("Khong tim thay");
                    }else {
                        if (employeecontroller.updateEmployee(id, new InputEmployee().input())){
                            System.out.println("Sua thanh cong");
                        }else {
                            System.out.println("Sua that bai");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Delete");
                    System.out.println("Nhap ID: ");
                    int id2 = HandleException.inputInt("Ban da nhap sai, moi nhap lai!");
                    if (employeecontroller.deleteEmployee(id2)){
                        System.out.println("Xoa thanh cong");
                    }else {
                        System.out.println("Xoa that bai");
                    }

                    break;
                case 4:
                    System.out.println("showExperience");
                    employeecontroller.showExperience();
                    break;
                case 5:
                    System.out.println("showFresher");
                    employeecontroller.showFresher();
                    break;
                case 6:
                    System.out.println("showIntern");
                    employeecontroller.showIntern();
                    break;
                case 0:
                    System.out.println("Exit!");
                    return;

                default:
                    System.out.println("Ban da nhap sai, moi nhap lai!");
                    break;
            }
        }

    }

    private static void menu(){
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. showExperience");
        System.out.println("5. showFresher");
        System.out.println("6. showIntern");
        System.out.println("0. Exit");

    }
}
