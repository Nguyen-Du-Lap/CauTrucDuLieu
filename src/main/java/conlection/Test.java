package conlection;

public class Test {
    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        TreeNode n5 = new TreeNode(5);
        myBST.insertRe(n5, 1);
        myBST.insertRe(n5, 6);
        myBST.insertRe(n5, 0);
        myBST.insertRe(n5, 3);
        myBST.insertRe(n5, 7);
        myBST.insertRe(n5, 2);

        myBST.lastOrder(n5);
        System.out.println("Done!");
    }
}
