package linked_list.doublyLinkedList.exercises;

import linked_list.doublyLinkedList.Node;
/*
    4. Implemente um editor de texto simples onde as operações de desfazer (undo)
     e refazer (redo) são gerenciadas por uma lista duplamente encadeada.
*/

public class Four {
    private Node head;

    public Four(){
        this.head = null;
    }

    public boolean isEmpty(){
        return this.head == null;
    }
}
