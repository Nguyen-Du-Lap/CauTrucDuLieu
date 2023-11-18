package conlection;

public class MyBinaryTree {
    TreeNode root;
    public MyBinaryTree(){}
    public void init() {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n0.leftNode = n1;
        n0.rightNode = n2;
        n1.leftNode = n3;
        n1.rightNode = n4;
        n2.rightNode = n5;
        root = n0;
    }
}
