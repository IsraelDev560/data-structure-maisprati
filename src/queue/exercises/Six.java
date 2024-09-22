package queue.exercises;

import linked_list.doublyLinkedList.Node;

public class Six {
    private Node first;
    private Node last;

    public Six(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void enqueue(String data){
        Node newNode = new Node(data);
        if(this.last == null){
            this.first = newNode;
            this.last = newNode;
            System.out.println(newNode.data + " Está Entrando na fila");
        } else{
           this.last.next = newNode;
           this.last = newNode;
            System.out.println(newNode.data + " Está Entrando na fila");
        }
    }

    public String dequeue(){
        if(this.first == null){
            throw new RuntimeException("Lista vazia");
        }

        String data = (String) this.first.data;
        this.first = this.first.next;
        System.out.println(data + " Está Saindo da fila");
        if(this.first == null){
            this.last = null;
        }

        return data;
    }

    public void list(){
        Node list = this.first;
        while (list != null){
            System.out.print(list.data);
            if (list.next == null){
                System.out.println();
            } else {
                System.out.print(" -> ");
            }
        list = list.next;
        }
    }
}
