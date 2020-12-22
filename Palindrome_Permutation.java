
public class Main
{
	public static void main(String[] args) {
		System.out.println(checkPermutationPallin("aacbd"));
	}
	
	public static boolean checkPermutationPallin(String s) {
	    
        int[] char_count = new int[128];
        
        int countOdd = 0;
        
        for(int i=0; i<s.length(); i++){
            char_count[s.charAt(i)]++;    
        
        }
        
        for(int i=0; i<128; i++) {
           countOdd+= char_count[i] %2;
        }
        
        
        return countOdd<=1;
	    
	    
	}
}
