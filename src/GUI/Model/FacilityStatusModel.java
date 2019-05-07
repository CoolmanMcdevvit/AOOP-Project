package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;

public class FacilityStatusModel {

    private HashMapData hmd;

    public FacilityStatusModel(HashMapData hmd){
        this.hmd = hmd;
    }

    //We call this method from FacilityStatusController. We pass HashMapData class to the constructor and call OccupediedBeds on to the HashMAp with String (Department).
    public int fillWithNumbers(String s){
        System.out.println("hy");
        try{return hmd.OccupiedBeds(s);}
        catch (Exception e){return 0;}

    }


}
