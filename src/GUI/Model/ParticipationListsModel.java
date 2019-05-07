//package GUI.Model;
//
//import Hospital.src.main.java.Hospital.HashMapData;
//
//import javax.swing.text.Document;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.util.Map;
//import java.util.Scanner;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//
//
//public class ParticipationListsModel {
//
//    private HashMapData hmd;
//
//    public ParticipationListsModel(HashMapData hmd){
//        this.hmd = hmd;
//    }
//
//    //We call this method from FacilityStatusController. We pass HashMapData class to the constructor and call OccupediedBeds on to the HashMAp with String (Department).
//    public void exportToPDF(String s){
//        Document document = new Document();
//        try
//        {
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Patientlist.pdf"));
//            document.open();
//            document.add(new Paragraph(hmd.printHMD()));
//            document.close();
//            writer.close();
//        } catch (DocumentException e)
//        {
//            e.printStackTrace();
//        } catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//
//}