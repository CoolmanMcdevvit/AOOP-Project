package GUI.Controller;

import GUI.Model.Session;
import GUI.View.ChangePatientView;
import GUI.View.HomePageView;
import GUI.View.PatientRegistrationView;
import GUI.View.RegistrationView;

public class PatRegistrationController{

    private PatientRegistrationView view;
    private HomePageView hview;


    public void check(String[] f) {
        int c = 0;
        for(int i=0; i<8; i++){
            if(!f[i].equals("")){
                c+=1;
            }
        }
        if(c == 8){
            System.out.print(f[1]);
        }

    }

    public void setView(PatientRegistrationView view,HomePageView hview){
        //System.out.println(view);
        this.view = view;
        this.hview = hview;
    }

    public void display(){view.setVisible(true);}

    public void returnHome(){
        view.dispose();
        hview.setVisible(true);

    }
}
