/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author git
 */
public class Encrypt extends Application {
    String keys [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"," "};
//     Array(
//        [aa] => 1;
//     );
     FileReader reader ;
    TextField txt,txt1,txt2,txt3;
    AnchorPane root;
    HBox hbox,hbox1,hbox2;
    VBox vbox,vbox1,vbox2;
    Button btn,btn1;
    Label lab,lab1,lab2;
     File file;
     TextArea atxt,atxt1;
      engine eng = new engine();
      String valeme = eng.trimm;
      Vector sand;
   String key;
      
    @Override
    public void start(Stage primaryStage) {
         root = new AnchorPane();
         btn = new Button();
         btn1 = new Button();
          txt = new TextField();
          txt1 = new TextField();
          txt2 = new TextField();
          txt3 = new TextField();
          hbox = new HBox();
          hbox1 = new HBox();
          hbox2 = new HBox();
          vbox = new VBox();
          vbox1 = new VBox();
          vbox2 = new VBox();
          lab = new Label();
          lab1 = new Label();
          lab2 = new Label();
         
          atxt = new TextArea();
          atxt1 = new TextArea();
           lab.getStyleClass().add("lab");
           lab1.getStyleClass().add("lab");
           lab2.getStyleClass().add("lab1");

            txt2.setPromptText("Key");
            txt3.setPromptText("Key");
            atxt.setEditable(false);
            atxt1.setEditable(false);
          hbox.getChildren().addAll(vbox,vbox1);
          hbox1.getChildren().addAll(txt,btn);
          hbox2.getChildren().addAll(txt1,btn1);
          vbox.getChildren().addAll(lab,atxt,txt2,hbox1);
          vbox1.getChildren().addAll(lab1,atxt1,txt3,hbox2);
           vbox2.getChildren().addAll(hbox,lab2);
        root.getChildren().addAll(vbox2);
          btn.setText("Encrypt");
          btn1.setText("Decrypt");
          lab.setText("Encryption");
          lab1.setText("Decrypt");
        Scene scene = new Scene(root, 700, 360);
         scene.getStylesheets().add(getClass().getResource("encrypt.css").toExternalForm());
         root.prefWidthProperty().bind(scene.widthProperty());
         hbox.prefWidthProperty().bind(vbox2.widthProperty());
         vbox2.prefWidthProperty().bind(root.widthProperty());
         txt.setPrefWidth(254);
         txt1.setPrefWidth(254);
         atxt1.setPrefWidth(252);
         atxt.setPrefWidth(200);
         atxt.setPrefHeight(200);
         atxt1.setPrefHeight(200);
         hbox.setPadding(new Insets(10, 10, 10, 10));
         hbox1.setPadding(new Insets(10, 10, 10, 10));
         hbox2.setPadding(new Insets(10, 10, 10, 10));
       
        btn.setOnAction(eve->{
            atxt.setText("");
            if(txt.getText().trim().isEmpty() || txt2.getText().trim().isEmpty() ){
                lab2.setText("Key and fields value can not be empty");
            }else{   
               
          Vector myvale = eng.convert_to_cypher(txt.getText());
            key = txt2.getText();
            for(int u = 0 ; u < myvale.size(); u++){
                 
                System.out.print(myvale.elementAt(u));
              atxt.appendText(myvale.elementAt(u).toString());
            }
            myvale.clear();
            }
              
        });
        btn1.setOnAction(eve->{
           atxt1.setText("");
            if(txt1.getText().trim().isEmpty() || txt3.getText().trim().isEmpty()){
                 lab2.setText("Key and fields value can not be empty");
            }else{
                System.out.println(key);
                if(key.trim().isEmpty() || !txt3.getText().equals(key)){ 
                  lab2.setText("Invalid key !");
                }else{
               
                 Vector realvalue = eng.realvalue(txt1.getText());
           
               for(int f = 0 ; f < realvalue.size(); f++){
                 
               atxt1.appendText(realvalue.elementAt(f).toString());
               
            }
                    realvalue.clear();
            }
            }
              
        });
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    
                }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
             // eng.getter();
           /*  for(int f = 0; f<keys.length; f++){
                 
            for(int s = 0; s< cal.length; s++){     
                if(cal[s].equals(keys[f])){
            System.out.println(cal[s]);
                }
                else {
                 System.out.println(cal[s]);
                }
                 }
            }
           try {
                   file = new File("C:\\Users\\git\\Documents\\NetBeansProjects\\Encrypt\\src\\encrypt\\letters.txt");
                     OutputStream outputstream = new FileOutputStream(file);
                      byte[] convet = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,1,2,3,4,5,6,7,8,9,0, ,+" .getBytes();    
     for(int s=0; s < convet.length;s++){
         // System.out.println(""+convet[s]);
                 outputstream.write(convet[s]);
     }
                     outputstream.close();
                     
            } catch (Exception e) {
            }
          try {
           File fi   = new File("C:\\Users\\git\\Documents\\NetBeansProjects\\Encrypt\\src\\encrypt\\keys.txt");
           File fil   = new File("C:\\Users\\git\\Documents\\NetBeansProjects\\Encrypt\\src\\encrypt\\letters.txt");
            
        FileReader reader  = new FileReader(fi);
        FileReader reader1  = new FileReader(fil);
          //;
          int cout1,cout;
          int num =0;
        
            while ((cout1 = reader.read()) != -1) {              
               // System.out.println( (char)cout);
               String wat = (char)cout1+"";
              //  System.out.println(wat);
                num +=1;
                 while ((cout = reader1.read()) != -1) {    
                     String raw =   (char)cout+"";
                             if(wat.equals(raw)){
                            System.out.println( (char)cout);
                     }
             
                num +=1;
                //
                
               // System.out.println(tarea1.getText());
          }
                
               // System.out.println(tarea1.getText());
          }
           
           
          //System.out.println(""+reader.read());
          System.out.println("---");
          
      } catch (Exception e) {
                  System.out.println(""+e);
//      }finally{ try {
//        //  reader.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(Encrypt.class.getName()).log(Level.SEVERE, null, ex);
//                }
}
           
            System.out.println("u"+keys.length);
        });
        **/
}
