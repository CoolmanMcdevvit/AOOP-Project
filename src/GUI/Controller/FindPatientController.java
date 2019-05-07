package GUI.Controller;

import GUI.View.FindPatientView;
import GUI.View.HomePageView;
import Hospital.src.main.java.Hospital.HashMapData;
import GUI.View.PatientRegistrationView;
import Hospital.src.main.java.Hospital.Patient;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class FindPatientController {

    private FindPatientView view;
    private HomePageView hview;


    public void setView(FindPatientView view, HomePageView hview){
        this.view = view;
        this.hview = hview;
    }

    public void display(){
        view.setVisible(true);
    }

    public String[][] findPatient(String selection, String search){
        HashMapData hm = new HashMapData();
        String[][] data={{"1","M","j","1222","asdads","123123","yes","jaimaican"},{"2","G","E","1222","asdads","123123","yes","jaimaican"},{"4","tTT","TTT","1222","asdads","123123","yes","jaimaican"}};
        if(selection=="Name"){
            List<Patient> patientList = new ArrayList<Patient>();
            patientList = hm.SearchPFirstName(search);
            return data;
        }
        if(selection=="Surname"){
            List<Patient> patientList = new ArrayList<Patient>();
            patientList = hm.SearchPLastName(search);
            return data;
        }
        if(selection=="UID"){
            try{
                Patient patient = new Patient();
                patient = hm.SearchpID(Integer.parseInt(search));
                return data;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        "Invalid value",
                        "",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        return null;
    }

    public void returnHome(){
        view.dispose();
        hview.setVisible(true);

    }
}
