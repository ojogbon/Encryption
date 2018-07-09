/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

import java.util.Vector;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author git
 */
public class engine {
    public  static   String trimm ;

      Vector<String>   vector = new Vector<>();  
      Vector<String>   vector_correct = new Vector<>();  
    
    
    
    public  Vector convert_to_cypher(String txt){
         String keys [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"," ","!","~","`","@","#","$","%","^","&","(",")","-","_","+","=","{","}","[","]",":","|","'",";",">","<","?","/",",","."};
        String convert = "";  
          System.out.println(keys[40]);
          for (String value : make_split(txt)) {
         
        
          if(keys[0].equals(value)){
             convert = "b";
          }
          else if( keys[1].equals(value)){
            convert = "c";
          }
          else if(keys[2].equals(value)){
            convert = "d";
          }
          else if(keys[3].equals(value)){
            convert = "e";
          }
          else if(keys[4].equals(value)){
            convert = "f";
          }
          else if(keys[5].equals(value)){
            convert = "g";
          }
          else if(keys[6].equals(value)){
            convert = "h";
          }
          else if(keys[7].equals(value)){
            convert = "i";
          }
          else if(keys[8].equals(value)){
            convert = "j";
          }
          else if(keys[9].equals(value)){
            convert = "k";
          }
          else if(keys[10].equals(value)){
            convert = "l";
          }
          else if(keys[11].equals(value)){
            convert = "m";
          }
          else if(keys[12].equals(value)){
            convert = "n";
          }
          else if(keys[13].equals(value)){
            convert = "o";
          }
          else if(keys[14].equals(value)){
            convert = "p";
          }
          else if(keys[15].equals(value)){
            convert = "q";
          }
          else if(keys[16].equals(value)){
            convert = "r";
          }
          else if(keys[17].equals(value)){
            convert = "s";
          }
          else if(keys[18].equals(value)){
            convert = "t";
          }
          else if(keys[19].equals(value)){
            convert = "u";
          }
          else if(keys[20].equals(value)){
            convert = "v";
          }
          else if(keys[21].equals(value)){
            convert = "w";
          }
          else if(keys[22].equals(value)){
            convert = "x";
          }
          else if(keys[23].equals(value)){
            convert = "y";
          }
          else if(keys[24].equals(value)){
            convert = "z";
          }
          else if(keys[25].equals(value)){
            convert = "a";
          }
          else if(keys[26].equals(value)){
            convert = "0";
          }
          else if(keys[27].equals(value)){
            convert = "1";
          }
          else if(keys[28].equals(value)){
            convert = "2";
          }
          else if(keys[29].equals(value)){
            convert = "3";
          }
          else if(keys[30].equals(value)){
            convert = "4";
          }
          else if(keys[31].equals(value)){
            convert = "5";
          }
          else if(keys[32].equals(value)){
            convert = "6";
          }
          else if(keys[33].equals(value)){
            convert = "7";
          }
          else if(keys[34].equals(value)){
            convert = "8";
          }
          else if(keys[35].equals(value)){
            convert = "9";
          }
          else if(keys[36].equals(value)){
            convert = "*";
          }
          else if(keys[37].equals(value)){
            convert = "~";
          }
          else if(keys[38].equals(value)){
            convert = "`";
          }
          else if(keys[39].equals(value)){
            convert = "@";
          }
          else if(keys[40].equals(value)){
            convert = "#";
          }
          else if(keys[41].equals(value)){
            convert = "$";
          }
          else if(keys[42].equals(value)){
            convert = "%";
          }
          else if(keys[43].equals(value)){
            convert = "^";
          }
          else if(keys[44].equals(value)){
            convert = "&";
          }
          else if(keys[45].equals(value)){
            convert = "(";
          }
          else if(keys[46].equals(value)){
            convert = ")";
          }
          else if(keys[47].equals(value)){
            convert = "-";
          }
          else if(keys[48].equals(value)){
            convert = "_";
          }
          else if(keys[49].equals(value)){
            convert = "+";
          }
          else if(keys[50].equals(value)){
            convert = "=";
          }
          else if(keys[51].equals(value)){
            convert = "{";
          }
          else if(keys[52].equals(value)){
            convert = "}";
          }
          else if(keys[53].equals(value)){
            convert = "[";
          }
          else if(keys[54].equals(value)){
            convert = "]";
          }
          else if(keys[55].equals(value)){
            convert = ":";
          }
          else if(keys[56].equals(value)){
            convert = "|";
          }
          else if(keys[57].equals(value)){
            convert = "'";
          }
          else if(keys[58].equals(value)){
            convert = ";";
          }
          else if(keys[59].equals(value)){
            convert = ">";
          }
          else if(keys[60].equals(value)){
            convert = "<";
          }
          else if(keys[61].equals(value)){
            convert = "?";
          }
          else if(keys[62].equals(value)){
            convert = "/";
          }
          else if(keys[63].equals(value)){
            convert = ",";
          }
          else if(keys[64].equals(value)){
            convert = ".";
          }
          else if(keys[65].equals(value)){
            convert = "!";
          }
       
      
    
       
      vector.add(convert);
      
          }
     
        return vector; 
    }
    
    public Vector realvalue (String correct ){                                                                                                                                           
    String keys [] = {"b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","a","0","1","2","3","4","5","6","7","8","9","*","!",".",",","/","?","<",">",";","'","|",":","]","[","}","{","=","+","_","-",")","(","&","^","%","$","#","@","`","~"};
         
      String convert = "";  
       
        for (String value : make_split(correct)) {
      
          if(keys[0].equals(value)){
             convert = "a";
          }
          else if( keys[1].equals(value)){
            convert = "b";
          }
          else if(keys[2].equals(value)){
            convert = "c";
          }
          else if(keys[3].equals(value)){
            convert = "d";
          }
          else if(keys[4].equals(value)){
            convert = "e";
          }
          else if(keys[5].equals(value)){
            convert = "f";
          }
          else if(keys[6].equals(value)){
            convert = "g";
          }
          else if(keys[7].equals(value)){
            convert = "h";
          }
          else if(keys[8].equals(value)){
            convert = "i";
          }
          else if(keys[9].equals(value)){
            convert = "j";
          }
          else if(keys[10].equals(value)){
            convert = "k";
          }
          else if(keys[11].equals(value)){
            convert = "l";
          }
          else if(keys[12].equals(value)){
            convert = "m";
          }
          else if(keys[13].equals(value)){
            convert = "n";
          }
          else if(keys[14].equals(value)){
            convert = "o";
          }
          else if(keys[15].equals(value)){
            convert = "p";
          }
          else if(keys[16].equals(value)){
            convert = "q";
          }
          else if(keys[17].equals(value)){
            convert = "r";
          }
          else if(keys[18].equals(value)){
            convert = "s";
          }
          else if(keys[19].equals(value)){
            convert = "t";
          }
          else if(keys[20].equals(value)){
            convert = "u";
          }
          else if(keys[21].equals(value)){
            convert = "v";
          }
          else if(keys[22].equals(value)){
            convert = "w";
          }
          else if(keys[23].equals(value)){
            convert = "x";
          }
          else if(keys[24].equals(value)){
            convert = "y";
          }
          else if(keys[25].equals(value)){
            convert = "z";
          }
          else if(keys[26].equals(value)){
            convert = "1";
          }
          else if(keys[27].equals(value)){
            convert = "2";
          }
          else if(keys[28].equals(value)){
            convert = "3";
          }
          else if(keys[29].equals(value)){
            convert = "4";
          }
          else if(keys[30].equals(value)){
            convert = "5";
          }
          else if(keys[31].equals(value)){
            convert = "6";
          }
          else if(keys[32].equals(value)){
            convert = "7";
          }
          else if(keys[33].equals(value)){
            convert = "8";
          }
          else if(keys[34].equals(value)){
            convert = "9";
          }
          else if(keys[35].equals(value)){
            convert = "0";
          }
          else if(keys[36].equals(value)){
            convert = " ";
          }
          else if(keys[37].equals(value)){
            convert = ".";
          }
          else if(keys[38].equals(value)){
            convert = ",";
          }
          else if(keys[39].equals(value)){
            convert = "/";
          }
          else if(keys[40].equals(value)){
            convert = "?";
          }
          else if(keys[41].equals(value)){
            convert = "<";
          }
          else if(keys[42].equals(value)){
            convert = ">";
          }
          else if(keys[43].equals(value)){
            convert = ";";
          }
          else if(keys[44].equals(value)){
            convert = "'";
          }
          else if(keys[45].equals(value)){
            convert = "|";
          }
          else if(keys[46].equals(value)){
            convert = ":";
          }
          else if(keys[47].equals(value)){
            convert = "]";
          }
          else if(keys[48].equals(value)){
            convert = "[";
          }
          else if(keys[49].equals(value)){
            convert = "}";
          }
          else if(keys[50].equals(value)){
            convert = "{";
          }
          else if(keys[51].equals(value)){
            convert = "=";
          }
          else if(keys[52].equals(value)){
            convert = "+";
          }
          else if(keys[53].equals(value)){
            convert = "_";
          }
          else if(keys[54].equals(value)){
            convert = "-";
          }
          else if(keys[55].equals(value)){
            convert = ")";
          }
          else if(keys[56].equals(value)){
            convert = "(";
          }
          else if(keys[57].equals(value)){
            convert = "&";
          }
          else if(keys[58].equals(value)){
            convert = "^";
          }
          else if(keys[59].equals(value)){
            convert = "%";
          }
          else if(keys[60].equals(value)){
            convert = "$";
          }
          else if(keys[61].equals(value)){
            convert = "#";
          }
          else if(keys[62].equals(value)){
            convert = "@";
          }
          else if(keys[63].equals(value)){
            convert = "`";
          }
          else if(keys[64].equals(value)){
            convert = "~";
          }
          else if(keys[65].equals(value)){
            convert = "!";
          }
        
      
      vector_correct.add(convert);
    
        }
    
    return vector_correct;
    }
    
    
    public String [] make_split (String txt){
     
         String [] cal = txt.split("");
            
        return cal;
    }  
    
    void join (String tobesplit){
      
    }
}
