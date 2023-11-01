package conlection;

public class MyLinkedListStack implements IStackQueue{
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node topNode;
    public MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public int pop() {
        if(!isEmpty()) {
            int value = topNode.value;
            topNode = topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean push(int value) {
        Node newNode = new Node(value);
        newNode.next = topNode;
        topNode = newNode;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if(isEmpty()) System.out.println("List is empty");
        else {
            Node temp = topNode;
            while (temp != null) {
                int value = temp.value;
                System.out.print(value+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
}
