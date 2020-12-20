public class Main{

     public static void main(String []args){
        System.out.println(checkUnique("abcde"));
     }
     
     public static boolean checkUnique(String str) {
         
         if(str.length() > 128) return false;
         
         boolean[] values = new boolean[128];
         
         for(int i=0; i<str.length(); i++){
             
             int value = str.charAt(i);
             
             if(values[value]) {
                 return false;
             } 
             
             values[value] = true;
         }
         return true;
         
     }
}
