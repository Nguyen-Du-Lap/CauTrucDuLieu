package conlection;

public class Node<item> {
    item item;
    Node prev;
    Node next;
    public Node(item item) {
        this.item = item;
    }
    public Node(item item, Node<item> nodeFirst, Node<item> nodeLast) {
        this.item = item;
        this.prev = nodeFirst;
        this.next = nodeLast;
    }

    public void addNodeLast(item item, Node<item> nodeLast) {
        this.item = item;
        this.next = nodeLast;
    }

    public void addNodeFist(item item, Node<item> nodeFirst) {
        this.item = item;
        this.prev = nodeFirst;
    }

    public void add(item item, Node<item> nodeFirst, Node<item> nodeLast) {
        this.item = item;
        this.prev = nodeFirst;
        this.next = nodeLast;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
