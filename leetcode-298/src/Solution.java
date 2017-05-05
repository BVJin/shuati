
public class Solution {
    public int longestConsecutive(TreeNode root) {
        int[] res = {1};
        if(root == null) return 0;
        TreeNode foo = root;
        dfs(res, foo, 1);
        return res[0];
    }
    
    public void dfs(int[] res, TreeNode curNode, int count){
    	//left
    	if(curNode.left != null && curNode.val + 1 == curNode.left.val){
    		count++;
    		res[0] = count>res[0]?count:res[0];
    		dfs(res, curNode.left, count);
    		count--;
    	}else if(curNode.left != null && curNode.val + 1 != curNode.left.val){
    		dfs(res, curNode.left, 1);
    	}
    	//right
    	if(curNode.right != null && curNode.val + 1 == curNode.right.val){
    		count++;
    		res[0] = count>res[0]?count:res[0];
    		dfs(res, curNode.right, count);
    		count--;
    	}else if(curNode.right != null && curNode.val + 1 != curNode.right.val){
    		dfs(res, curNode.right, 1);
    	}
    }
}
