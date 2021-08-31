package repository;

import entity.Experience;
import entity.Fresher;
import entity.Intern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepopsitory {

    private Map<Integer, Experience> mapExperience;
    private Map<Integer, Fresher> mapFresher;
    private Map<Integer, Intern> mapIntern;

    public EmployeeRepopsitory() {
        mapExperience = new HashMap<>();
        mapFresher = new HashMap<>();
        mapIntern = new HashMap<>();
    }

    public Map<Integer, Experience> getMapExperience() {
        return mapExperience;
    }

    public void setMapExperience(Map<Integer, Experience> mapExperience) {
        this.mapExperience = mapExperience;
    }

    public Map<Integer, Fresher> getMapFresher() {
        return mapFresher;
    }

    public void setMapFresher(Map<Integer, Fresher> mapFresher) {
        this.mapFresher = mapFresher;
    }

    public Map<Integer, Intern> getMapIntern() {
        return mapIntern;
    }

    public void setMapIntern(Map<Integer, Intern> mapIntern) {
        this.mapIntern = mapIntern;
    }
}
