package conlection;

public class MyLinkedListQueue implements IStackQueue{
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node headNode;
    public MyLinkedListQueue() {
        headNode = null;
    }
    @Override
    public int pop() {
        int value = -1;
        if(!isEmpty()) {
            Node cuNode = headNode;
            Node prevNode = cuNode;
            while(cuNode.next != null) {
                prevNode = cuNode;
                cuNode = cuNode.next;
            }
            value = cuNode.value;
            prevNode.next = null;
            if(cuNode == prevNode) headNode = null;
        }
        return value;
    }

    @Override
    public boolean push(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            newNode.next = headNode;
            headNode = newNode;
        }else {
            Node cuNode = headNode;
            while(cuNode.next != null) {
                cuNode = cuNode.next;
            }
            cuNode.next = newNode;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if(isEmpty()) System.out.println("List is empty");
        else {
            Node temp = headNode;
            while (temp != null) {
                int value = temp.value;
                System.out.print(value+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
