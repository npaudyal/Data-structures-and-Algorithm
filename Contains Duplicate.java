// HashSet collision probability so the runtime is slower.;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> mySet = new HashSet<Integer>();
            
        for(int i=0; i<nums.length; i++) {
            if(mySet.contains(nums[i])) {
                return true;
            } else 
            {
                
                mySet.add(nums[i]);
            }
            
       
        }
         return false;    
        
    }
}

// Faster and more efficient solution 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       Arrays.sort(nums);
        
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
        
    }
}
