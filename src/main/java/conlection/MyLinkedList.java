package conlection;

public class MyLinkedList {
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node addHead(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node addTail(Node nodeHead, int value) {
        Node newNode = new Node(value);
        if (nodeHead == null) {
            return newNode;
        }
        Node nodeLast = nodeHead;
        while (nodeLast.next != null) {
            nodeLast = nodeLast.next;
        }
        nodeLast.next = newNode;

        return newNode;
    }

    public static Node addToIndex(Node nodeHead, int index, int value) {
        Node newNode = new Node(value);
        if (nodeHead == null) {
            return newNode;
        }
        Node nodeCur = nodeHead;
        Node nodePrev = null;
        int count = 0;
        while (nodeCur != null) {
            if (count == index) break;
            count++;
            nodePrev = nodeCur;
            nodeCur = nodeCur.next;
        }
        if (nodePrev == null) {
            newNode.next = nodeCur;
        } else {
            nodePrev.next = newNode;
            newNode.next = nodeCur;
        }

        return newNode;
    }

    public static Node removeAtHead(Node nodeHead) {
        if (nodeHead != null) {
            return nodeHead.next;
        }
        return nodeHead;
    }

    public static Node removeAtTail(Node nodeHead) {
        Node nodeCur = nodeHead;
        Node nodePrev = null;
        while (nodeCur.next != null) {
            nodePrev = nodeCur;
            nodeCur = nodeCur.next;
        }
        nodePrev.next = null;
        return nodeHead;
    }

    public static int size(Node nodeHead) {
        int count = 0;
        if (nodeHead != null) {
            Node temp = nodeHead;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                count++;
            }
        }

        return count;
    }

    public static void printListNode(Node nodeHead) {
        if (nodeHead == null) {
            System.out.println("List node is empty");
        } else {
            Node temp = nodeHead;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

//        addHead(node1, node4);
//        printListNode(node4);
//        addTail(node4, node0);
//        printListNode(node4);

//        addToIndex(node1, 4, 5);
//        printListNode(node1);

//        Node n1 = removeAtHead(node1);
//        printListNode(n1);

        removeAtTail(node1);
        printListNode(node1);
    }
}
