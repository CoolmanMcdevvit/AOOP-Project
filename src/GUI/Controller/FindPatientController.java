package GUI.Controller;

import GUI.Model.FindPatientModel;
import GUI.View.FindView;
import GUI.View.HomePageView;
import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.List;

//subclass of FindController
public class FindPatientController extends FindController{


    private FindPatientModel model;
    private Object [][] data;
    private TableModel table;

    // sets FindPatientModel as private variable
    public FindPatientController(FindPatientModel mdl) {
        this.model = mdl;
    }


    //searches for data based on button selected in view (name,surname or id)
    public TableModel findPatient(String selection, String search){
        // sets string list for collumn values to be used later
        String [] columns = {"Name","Surname","Address","Birthday","ID","Tribe","Phone Number","Alive","Department","Bed Nr."};

        // try catch statement for invalid inputs
        try{
            // sends input to model depending on searchbutton selected
            if(selection=="Name"){
                data = model.nameSearch(search);
            }
            if(selection=="Surname"){
                data = model.surnameSearch(search);
            }
            if(selection=="UID"){
                try{
            //attempts to parse integer returns errorstatement on fail
                    data = model.idSearch(Integer.parseInt(search));
                }
                //catch statement shows pop-up pane with invalid value message
                catch (Exception e){
                    JOptionPane.showMessageDialog(null,
                            "Invalid value",
                            "",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
            //sets table value as retrieved data and the string array definied at start of method
            table = new DefaultTableModel(data,columns);
            return table;}
        //on error returns empty table
        catch (Exception e){return table;}
    }

    }

