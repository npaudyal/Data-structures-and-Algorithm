/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        if(t == null && s != null) return true;
        
        if(s == null && t!= null) return false;
        
        if(s !=null && t!= null) {
             if(checkIdentical(s,t)) return true;
        }
        
       return isSubtree(s.left, t) || isSubtree(s.right, t);
        
    
        
    }
    
    public boolean checkIdentical(TreeNode s, TreeNode t){
       
        if(s == null && t==null) return true;
        if(s == null || t==null) return false;
        
        if(s !=null && t!=null) {
            
            if((s.val == t.val) && checkIdentical(s.left, t.left) && checkIdentical(s.right, t.right)) return true;
        }
        
        return false;
       
    }
    

}

// public boolean isSubtree(TreeNode s, TreeNode t) {
        
//         boolean res = compare(s, t);
        
//         if (res) return true;
//         else if (s == null) return false;
//         else return isSubtree(s.left, t) || isSubtree(s.right, t);
//     }
    
//     public boolean compare(TreeNode x, TreeNode y)
//     {
//         if (x == null && y == null) return true;
//         else if (x == null || y == null) return false;
//         else if (x.val != y.val) return false;
//         else return compare(x.left, y.left) && compare(x.right, y.right);
//     }
