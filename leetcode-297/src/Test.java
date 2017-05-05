
public class Test {
	public static void main(String[] arg){
		Codec c = new Codec();
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(12);
		head.left.left = null;
		head.left.right = null;
		head.right.left = new TreeNode(3);
		head.right.right = new TreeNode(10);
		String s= c.serialize(head);
		System.out.println(s);
		String ss = "1,2,12, , ,3,10, , , , ,";
		TreeNode root = c.deserialize(ss);
		System.out.println(root.val);
		System.out.println(root.left.val);
		System.out.println(root.right.val);
		System.out.println(root.left.left);
		System.out.println(root.left.right);
		System.out.println(root.right.left.val);
		System.out.println(root.right.right.val);
	}
}
