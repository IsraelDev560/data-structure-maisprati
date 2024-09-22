package linked_list.doublyLinkedList.exercises;

import linked_list.doublyLinkedList.Node;

/*
5. Implemente um jogo simples de cartas onde a mão do jogador é representada
   por uma lista duplamente encadeada. Permita que o jogador adicione, remova,
   e reorganize as cartas na mão.
*/

public class Five<T> {
    private Node<T> head;
    private Node<T> current;

    public Five(){
        this.head = null;
        this.current = null;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addLetter(T data){
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            this.head = newNode;
            System.out.println("Adicionando... " + newNode.data);
        } else {
            Node<T> lastNode = this.head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.previous = lastNode;
            System.out.println("Adicionando... "+ newNode.data);
        }
    }

    public void removeLetter(int index){
        if (isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Índice inválido.");
        }
        if(index == 0){
            Object removedData = this.head.data;
            this.head = this.head.next;
            System.out.println("Removendo..."+removedData );
            return;
        }
        Node<T> current = this.head;
        Node<T> previous = null;
        int indexCurrent = 0;
        while (current != null){
            if(index == indexCurrent){
                previous.next = current;
                System.out.println("Removendo..."+ current.data);
                break;
            }
            indexCurrent++;
            previous = current;
            current = current.next;
        }
        if(current == null){
            throw new RuntimeException("Index out of bounds");
        }
    }

    public void reorganize(int index){
        if (isEmpty()){
            throw new RuntimeException("Lista vazia.");
        }
        Node<T> current = this.head;
        int indexCurrent = 0;
        while (current != null){
            if(index == indexCurrent){
               current = current.next;
            }
            current = current.next;
            indexCurrent++;
        }
    }

    public void list(){
        Node<T> list = this.head;
        while (list != null ){
            System.out.print(list.data);
            if(list.next == null){
                System.out.println();
            } else {
                System.out.print(" -> ");
            }
            list = list.next;
        }
    }

}
