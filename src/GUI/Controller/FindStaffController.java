package GUI.Controller;

import GUI.Model.FindPatientModel;
import GUI.Model.FindStaffModel;
import GUI.View.FindView;
import GUI.View.HomePageView;
import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.List;


public class FindStaffController extends FindController{

    private FindStaffModel model;
    private Object [][] data;
    private TableModel table;

    public FindStaffController(FindStaffModel mdl) {
        this.model = mdl;
    }

    public TableModel findStaff(String selection, String search){
        String [] columns = {"Name","Surname","ID","E-Mail","Role"};

        try{

            if(selection=="Name"){
                data = model.nameSearch(search);
            }
            if(selection=="Surname"){
                data = model.surnameSearch(search);
            }
            if(selection=="UID"){
                try{

                    data = model.idSearch(Integer.parseInt(search));
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null,
                            "Invalid value",
                            "",
                            JOptionPane.WARNING_MESSAGE);
                }
            }



            table = new DefaultTableModel(data,columns);
            return table;}
        catch (Exception e){return table;}
    }


}