package service;

import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import repository.EmployeeRepopsitory;
import view.InputEmployee;

import java.util.Map;

public class EmployeeServiceImpl implements IEmployeeService {

    EmployeeRepopsitory repopsitory = new EmployeeRepopsitory();
    @Override
    public boolean addEmplopyee(Employee employee) {
        if (employee instanceof Experience){
            repopsitory.getMapExperience().put(employee.getId(), (Experience) employee);
            return true;
        }else if (employee instanceof Fresher){
            repopsitory.getMapFresher().put(employee.getId(), (Fresher) employee);
            return true;
        }else if (employee instanceof Intern){
            repopsitory.getMapIntern().put(employee.getId(), (Intern) employee);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateEmployee(int id, Employee employeeUpdate) {
        if(findEmployee(id) == 0) {

            Experience newExperience = (Experience) employeeUpdate;
            Experience oldExperience = repopsitory.getMapExperience().get(newExperience.getId());

            repopsitory.getMapExperience().get(newExperience.getId()).setFullName(newExperience.getFullName() != null ?
                    newExperience.getFullName() : oldExperience.getFullName());
            repopsitory.getMapExperience().get(newExperience.getId()).setBirthday(newExperience.getBirthday() != null ?
                    newExperience.getBirthday() : oldExperience.getBirthday());
            repopsitory.getMapExperience().get(newExperience.getId()).setPhone(newExperience.getPhone() != null ?
                    newExperience.getPhone() : oldExperience.getPhone());
            repopsitory.getMapExperience().get(newExperience.getId()).setEmail(newExperience.getEmail() != null ?
                    newExperience.getEmail() : oldExperience.getEmail());
            repopsitory.getMapExperience().get(newExperience.getId()).setCertificates(newExperience.getCertificates().size() != 0 ?
                    newExperience.getCertificates() : oldExperience.getCertificates());
            repopsitory.getMapExperience().get(newExperience.getId()).setProSkill(newExperience.getProSkill() != null ?
                    newExperience.getProSkill() : oldExperience.getProSkill());
            repopsitory.getMapExperience().get(newExperience.getId()).setExpInYear(newExperience.getExpInYear() != 0 ?
                    newExperience.getExpInYear() : oldExperience.getExpInYear());
            return true;
        }
        else if(repopsitory.getMapFresher().containsKey(employeeUpdate.getId())) {
            Fresher newFresher = (Fresher) employeeUpdate;
            Fresher oldFresher = repopsitory.getMapFresher().get(newFresher.getId());
            repopsitory.getMapFresher().get(newFresher.getId()).setFullName(newFresher.getFullName() != null ?
                    newFresher.getFullName() : oldFresher.getFullName());
            repopsitory.getMapFresher().get(newFresher.getId()).setBirthday(newFresher.getBirthday() != null ?
                    newFresher.getBirthday() : oldFresher.getBirthday());
            repopsitory.getMapFresher().get(newFresher.getId()).setPhone(newFresher.getPhone() != null ?
                    newFresher.getPhone() : oldFresher.getPhone());
            repopsitory.getMapFresher().get(newFresher.getId()).setEmail(newFresher.getEmail() != null ?
                    newFresher.getEmail() : oldFresher.getEmail());
            repopsitory.getMapFresher().get(newFresher.getId()).setCertificates(newFresher.getCertificates().size() != 0 ?
                    newFresher.getCertificates() : oldFresher.getCertificates());
            repopsitory.getMapFresher().get(newFresher.getId()).setSchoolName(newFresher.getSchoolName() != null ?
                    newFresher.getSchoolName() : oldFresher.getSchoolName());
            repopsitory.getMapFresher().get(newFresher.getId()).setGraduationDate(newFresher.getGraduationDate() != null ?
                    newFresher.getGraduationDate() : oldFresher.getGraduationDate());
            repopsitory.getMapFresher().get(newFresher.getId()).setGraduationRank(newFresher.getGraduationRank() != null ?
                    newFresher.getGraduationRank() : oldFresher.getGraduationRank());
            return true;
        }
        else if(repopsitory.getMapIntern().containsKey(employeeUpdate.getId())) {
            Intern newIntern = (Intern) employeeUpdate;
            Intern oldIntern = repopsitory.getMapIntern().get(newIntern.getId());
            //repopsitory.getMapExperience.replace(employeeUpdate.getId(), (Experience) employeeUpdate);
            repopsitory.getMapIntern().get(newIntern.getId()).setFullName(newIntern.getFullName() != null ?
                    newIntern.getFullName() : oldIntern.getFullName());
            repopsitory.getMapIntern().get(newIntern.getId()).setBirthday(newIntern.getBirthday() != null ?
                    newIntern.getBirthday() : oldIntern.getBirthday());
            repopsitory.getMapIntern().get(newIntern.getId()).setPhone(newIntern.getPhone() != null ?
                    newIntern.getPhone() : oldIntern.getPhone());
            repopsitory.getMapIntern().get(newIntern.getId()).setEmail(newIntern.getEmail() != null ?
                    newIntern.getEmail() : oldIntern.getEmail());
            repopsitory.getMapIntern().get(newIntern.getId()).setCertificates(newIntern.getCertificates().size() != 0 ?
                    newIntern.getCertificates() : oldIntern.getCertificates());
            repopsitory.getMapIntern().get(newIntern.getId()).setMajors(newIntern.getMajors() != null ?
                    newIntern.getMajors() : oldIntern.getMajors());
            repopsitory.getMapIntern().get(newIntern.getId()).setSemester(newIntern.getSemester() != 0 ?
                    newIntern.getSemester() : oldIntern.getSemester());
            repopsitory.getMapIntern().get(newIntern.getId()).setUniversityName(newIntern.getUniversityName() != null ?
                    newIntern.getUniversityName() : oldIntern.getUniversityName());
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteEmployee(int id) {

        if(repopsitory.getMapExperience().containsKey(id)){
            repopsitory.getMapExperience().remove(id);
            return true;
        }
        else if(repopsitory.getMapFresher().containsKey(id)){
            repopsitory.getMapFresher().remove(id);
            return true;
        }
        else if(repopsitory.getMapIntern().containsKey(id)){
            repopsitory.getMapIntern().remove(id);
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public void showInfoFresher() {
        for (Map.Entry<Integer, Fresher> entry : repopsitory.getMapFresher().entrySet()) {
            entry.getValue().showInfo();
        }
    }

    @Override
    public void showInfoExperience() {
            for (Map.Entry<Integer, Experience> entry : repopsitory.getMapExperience().entrySet()) {
                entry.getValue().showInfo();
            }
    }


    @Override
    public void showInfoIntern() {
                for (Map.Entry<Integer, Intern> entry : repopsitory.getMapIntern().entrySet()) {
                    entry.getValue().showInfo();
                }
    }

    @Override
    public int findEmployee(int id) {
        if(repopsitory.getMapExperience().containsKey(id)) {
            return 0;
        }
        else if(repopsitory.getMapFresher().containsKey(id)) {
            return 1;
        }
        else if(repopsitory.getMapIntern().containsKey(id)) {
            return 2;
        }else {
            return -1;
        }

    }
}
