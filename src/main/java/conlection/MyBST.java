package conlection;

public class MyBST {
    TreeNode mRoot;
    public MyBST() {

    }
    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        //TH1: root == null
        if(root == null) return newNode;
        else {
            TreeNode temp = root;
            while(true) {
                if(value < temp.value) {
                    if(temp.leftNode == null) {
                        temp.leftNode = newNode;
                        break;
                    }else {
                        temp = temp.leftNode;
                    }
                }else {
                    if(temp.rightNode == null) {
                        temp.rightNode = newNode;
                        break;
                    }else {
                        temp = temp.rightNode;
                    }
                }
            }
            return root;
        }
    }
    public TreeNode insertRe(TreeNode root, int value) {
        if(root == null) return new TreeNode(value);
        if(value < root.value) {
            if(root.leftNode == null) {
                root.leftNode = new TreeNode(value);
            }else {
                insertRe(root.leftNode, value);
            }
        }else {
            if(root.rightNode == null) {
                root.rightNode = new TreeNode(value);
            }else {
                insertRe(root.rightNode, value);
            }
        }
        return root;
    }
    public TreeNode findLeftMoveNode(TreeNode root) {
        if(root == null) return null;
        TreeNode leftMostNode = root;
        while(leftMostNode.leftNode != null) {
            leftMostNode = leftMostNode.leftNode;
        }
        return leftMostNode;

    }
    public TreeNode remove(TreeNode root, int value) {
        if(root == null) return null;
        // xác định được node xóa
        if(root.value == value) {
            //TH1: root la node la
            if(root.leftNode == null && root.rightNode == null) {
                return null;
            }
            //TH2: chi co 1 con ben phai
            if(root.leftNode == null && root.rightNode != null) {
                return root.rightNode;
            }
            //TH3: chi co 1 con ben trai
            if(root.leftNode != null && root.rightNode == null) {
                return root.leftNode;
            }
            //TH4:
            if(root.leftNode != null && root.rightNode != null) {
                TreeNode leftModeNode = findLeftMoveNode(root.rightNode);
                root.value = leftModeNode.value;
                root.rightNode = remove(root.rightNode, leftModeNode.value);
            }
        }else if(root.value > value) {
            root.leftNode = remove(root.leftNode, value);
        }else if(root.value < value) {
            root.rightNode = remove(root.rightNode, value);
        }
        return root;
    }

    public TreeNode searchTree(TreeNode root, int value) {
        if(root == null) return null;
        TreeNode target = root;
        while (true) {
            if(target == null) return null;
            if(value < target.value) {
                target = target.leftNode;
            } else if(value > target.value) {
                target = target.rightNode;
            }else {
                return target;
            }
        }
    }
    // Node - L - R
    public void preOrder(TreeNode currentNode) {
        if(currentNode == null) return;
        System.out.print(currentNode.value + " ");
        // L R
        preOrder(currentNode.leftNode);
        preOrder(currentNode.rightNode);
    }

    // L - Node - R
    public void inOrder(TreeNode currentNode) {
        if(currentNode == null) return;

        inOrder(currentNode.leftNode);
        System.out.print(currentNode.value + " ");
        inOrder(currentNode.rightNode);
    }

    // L - R - Node
    public void lastOrder(TreeNode currentNode) {
        if(currentNode == null) return;

        lastOrder(currentNode.leftNode);
        lastOrder(currentNode.rightNode);
        System.out.print(currentNode.value + " ");
    }

}
