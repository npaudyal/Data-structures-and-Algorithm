import java.io.*;
import java.util.*;

public class Main{

     public static void main(String []args){
        System.out.println(checkPermutation("abba", "baba"));
     }
     
     public static boolean checkPermutation(String str1, String str2) {
         
        if(str1.length() != str2.length()){
            return false;
        }
        
        int count =0;
        
        for(int i=0; i<str1.length(); i++){
            count+=str1.charAt(i);
        }
        
        for(int i=0; i<str2.length(); i++){
            count = count - str2.charAt(i);
        }
        
        if(count == 0) return true;
        return false;
        
         
      
}
}
