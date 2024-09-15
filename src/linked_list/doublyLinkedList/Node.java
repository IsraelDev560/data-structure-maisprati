package linked_list.doublyLinkedList;

public class Node { ;
    public String data;
    public Node next, previous;

    public Node(String data){
        this.previous = null;
        this.data = data;
        this.next = null;
    }
}
