package Google;

public class GoodLeafPairs {
    

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


    int result = 0;
    public int countPairs(TreeNode root, int d) {
        dfs(root,d);
        return result;
    }
    
 public  int[] dfs(TreeNode root,int d){
        if(root == null)
            return new int[d+1];
        if(root.left == null && root.right == null){
            int arr[] = new int[d+1];
            arr[1] = 1;
            return arr;
        }
        int[] left = dfs(root.left,d);
        int[] right = dfs(root.right,d);
     
        for(int l = 1 ;l < left.length ; l++){
            for(int r = d-1; r > 0 ; r--){
                if(l+r <= d)
                result += left[l]*right[r];
            }
        }
        int res[] = new int[d+1];
        for(int i = res.length-2 ; i >= 1 ; i--){
            res[i+1] = left[i]+right[i];
        }
        
        return res;
    }

}
