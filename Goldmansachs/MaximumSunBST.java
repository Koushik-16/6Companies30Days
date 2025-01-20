package Goldmansachs;

public class MaximumSunBST {
    
  public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
          this.left = left;
          this.right = right;
     }
  }
 
    class Pair {
        int max ;
        int min ;
        int sum ;
        Pair(int max, int min, int sum){
            this.max = max;
            this.min = min;
            this.sum = sum;
        }
    }
    int ans = Integer.MIN_VALUE;
    public int maxSumBST(TreeNode root) {
        Pair p = helper(root);
        if(p != null ) ans = Math.max(ans,p.sum);
        return Math.max(ans,0);
    }
    
    public Pair helper(TreeNode root){
        if(root == null) return new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        Pair l = helper(root.left);
        Pair r = helper(root.right);
    if(l == null || r == null || l.max >= root.val || r.min <= root.val ) return null;
        else {
            int max = Math.max(root.val,r.max);
            int min = Math.min(root.val,l.min);
            int sum = l.sum + r.sum + root.val;
            ans = Math.max(ans,sum);
            return new Pair(max,min,sum);
        }
    }





}
