package algostudy.jongmin.datastructure;

public class Main {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		Stack<Integer> s = new Stack<Integer>();
		Queue<Integer> q = new Queue<Integer>();
		LinkedTree tree = new LinkedTree();
		
        TreeNode n7 = tree.makeBT(null, 'D', null);
        TreeNode n6 = tree.makeBT(null, 'C', null);
        TreeNode n5 = tree.makeBT(null, 'B', null);
        TreeNode n4 = tree.makeBT(null, 'A', null);
        TreeNode n3 = tree.makeBT(n6, '/', n7);
        TreeNode n2 = tree.makeBT(n4, '*', n5);
        TreeNode n1 = tree.makeBT(n2, '-', n3);
        
        System.out.print("\nPreorder : ");
        tree.preorder(n1);
        
        System.out.print("\nInorder : ");
        tree.inorder(n1);
        
        System.out.print("\nPostorder : ");
        tree.postorder(n1);
	}
}
