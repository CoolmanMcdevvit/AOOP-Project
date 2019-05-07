package GUI.Model;

import Hospital.src.main.java.Hospital.StaffMap;


public class FindStaffModel implements FindInterface{

    private StaffMap hmd;

    public FindStaffModel(StaffMap hmd){
        this.hmd = hmd;
    }

    public Object [][] nameSearch(String search){
        return hmd.SearchSFirstName(search);
    }
    public Object [][] surnameSearch(String search){
        return hmd.SearchSLastName(search);
    }
    public Object [][] idSearch(Integer search){
        System.out.println(search);
        return hmd.StaffSearchID(search);
    }

}
