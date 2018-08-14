package algostudy.jongmin.datastructure;

public class LinkedTree {
    
    public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2){
        TreeNode root = new TreeNode(data);
        root.left = bt1;
        root.right = bt2;
        return root;
    }
    
    public void preorder(TreeNode root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    
    public void postorder(TreeNode root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}











