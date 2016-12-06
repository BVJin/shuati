import java.util.ArrayList;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if(root == null) return null;
    	//level by level
        String s = Integer.toString(root.val);
        ArrayList<TreeNode> cur = new ArrayList<TreeNode>();
        cur.add(root);
        while(cur.size()>0){
        	ArrayList<TreeNode> curLvl = new ArrayList<TreeNode>();
        	for(TreeNode tree : cur){
        		//from left to right
        		if(tree.left != null){
        			s += Integer.toString(tree.left.val);
        			curLvl.add(tree.left);
        		}else if(tree.left == null){
        			s += " ";
        		}
        		s += " ";
        		if(tree.right != null){
        			s += Integer.toString(tree.right.val);
        			curLvl.add(tree.right);
        		}else if(tree.right == null){
        			s += " ";
        		}
        		s += " ";
        	}
        	
        	cur = curLvl;
        }
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.length()==0) return null;
        int start = 0, end = 0;
        while(data.charAt(end)!=' '){
        	end++;
        }
        TreeNode root  = new TreeNode(Integer.parseInt(data.substring(start, end)));
        ArrayList
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));