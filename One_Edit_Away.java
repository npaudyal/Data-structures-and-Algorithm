
public class Main
{
	public static void main(String[] args) {
		System.out.println(checkEdit("aacbd", "aacb"));
	}
	
	public static boolean checkEdit(String s1, String s2) {
	    
        int m = s1.length();
        int n = s2.length();
        int count =0;
        
        int i=0, j=0;
        
        if(Math.abs(m-n) > 1) return false;
        
        while(i<m && j<n) {
            
            if(s1.charAt(i) != s2.charAt(j) ) {
            if(count == 1) return false;
            
            if(m>n) i++;
            if(n>m) j++;
            else {
                i++;
                j++;
            }
            count++;
            
            }
            
            i++;
            j++;
        }
        return count == 1;
	    
	}
}
