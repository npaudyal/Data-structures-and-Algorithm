
class Solution {
    public int balancedStringSplit(String s) {
        
        int balancedCount =0;
        int count =0;
        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            if(a == 'L') {
                count++;
            } else if(a == 'R') {
                count--;
            } if(count == 0) {
                        balancedCount++;
            } 
        }
        
        return balancedCount;
        
    }
}
