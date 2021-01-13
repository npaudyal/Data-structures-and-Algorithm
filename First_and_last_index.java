class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums == null || nums.length == 0) return new int[] {-1, -1};
        
        int[] result = new int[2];
        
        result[0] = findFromLeft(nums, target);
        result[1] = findFromRight(nums, target);
        
        return result;
        
    }
    
    public int findFromLeft(int[] nums, int target) {
        
        int index = -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left<=right) {
            int mid = left + (right-left)/2;
            
            if(nums[mid] >= target) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
            
            if(nums[mid] == target) index = mid;
            
        }
        
        return index;
        
    }
    
     public int findFromRight(int[] nums, int target) {
          
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while(left<=right) {
            int mid = left + (right-left)/2;
            
            if(nums[mid] <= target) {
                left = mid+1;
            } else {
                right = mid - 1;
            }
            
            if(nums[mid] == target) index = mid;
            
        }
        
        return index;
        
    }
}
