package GUI.Controller;

import GUI.View.HomePageView;
import GUI.View.PersonInfoView;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//PersonController superclass for information updating Controllers
public class PersonController {

    private HomePageView hview;
    private PersonInfoView view;


    public void setView(PersonInfoView view, HomePageView hview) {
        this.view = view;
        this.hview = hview;
    }

    public void display() {
        view.setVisible(true);
    }

    public void returnHome() {
        view.dispose();
        hview.setVisible(true);
    }

    //clears textfields when clear pressed
    public void clear(JTextField[] fields, int a) {
        for (int i = 0; i <= a; i++) {
            fields[i].setText("");
        }
    }

    //ensures birthdate format is correct
    public boolean checkBirthday(JTextField[] f) {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);
        String date = f[2].getText() +"." + f[3].getText() + "." + f[4].getText();
        try {
            format.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    //checks if fields are blank then returns true if no fields are blank
   public boolean checkForBlanks(JTextField[] fields, int a){
       int c = 0;
       //for loop iterating over fields value checking for blanks inputs
       for(int i=0; i<a; i++){
           if(!fields[i].getText().equals("")){
               c+=1;
           }
       }
       return c == a;
   }

}
