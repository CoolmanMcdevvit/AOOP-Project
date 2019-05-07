package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;

public class FacilityStatusModel {

    private HashMapData hmd;

    public FacilityStatusModel(HashMapData hmd){
        this.hmd = hmd;
    }

    public int fillWithNumbers(String s){
        System.out.println("hy");
        try{return hmd.OccupiedBeds(s);}
        catch (Exception e){return 0;}

    }


}
