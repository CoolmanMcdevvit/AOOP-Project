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


public class FindStaffController extends FindController {

    private FindStaffModel model;
    private Object[][] data;
    private TableModel table;

    //defines FindStaffModel as private variable of class
    public FindStaffController(FindStaffModel mdl) {
        this.model = mdl;
    }


    public TableModel findStaff(String selection, String search) {
        String[] columns = {"Name", "Surname", "ID", "E-Mail", "Role"};

        try {
            // sends input to model depending on searchbutton selected
            if (selection == "Name") {
                data = model.nameSearch(search);
            }
            if (selection == "Surname") {
                data = model.surnameSearch(search);
            }
            if (selection == "UID") {
                try {
                    //attempts to parse integer returns errorstatement on fail
                    data = model.idSearch(Integer.parseInt(search));
                }
                //catch statement shows pop-up pane with invalid value message
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid value",
                            "",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
            //sets table value as retrieved data and the string array definied at start of method
            table = new DefaultTableModel(data, columns);
            return table;
        }
        //on error returns empty table
        catch (Exception e) {
            return table;
        }
    }
}