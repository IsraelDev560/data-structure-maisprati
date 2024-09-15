package linked_list.singlyLinkedList.exercises;
/*
3. Implemente um sistema de controle de reversão (undo) para uma aplicação de edição de texto.
   Use uma lista simplesmente encadeada para armazenar as ações realizadas e permita que o usuário
   desfaça as últimas ações.
*/

import linked_list.singlyLinkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class Three {
    private Node head;

    public Three(){
        this.head = null;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addText(String data){
        Node newNode = new Node(data);
        if(isEmpty()){
            this.head = newNode;
            System.out.println("Adicionando... "+ newNode.data);
        } else{
            Node current = this.head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            System.out.println("Adicionando... " + newNode.data);
        }
    }

    public void undo() {
        if (isEmpty()) {
            throw new RuntimeException("Listá vazia.");
        }
        if(this.head.next == null){
            this.head = null;
            return;
        }
        Node current = this.head;
        while (current.next.next != null){
            current = current.next;
        }
        System.out.println("Desfazendo: " + current.next.data);
        current.next = null;
    }

    public void removeText(int index){
        if (isEmpty()){
            throw new RuntimeException("Lista vazia.");
        }
        if(index == 0){
            Object removedData = this.head.data;
            this.head = this.head.next;
            System.out.println("Removendo... " + removedData);
            return;
        }
        Node previous = null;
        Node current = this.head;
        int indexCurrent = 0;
        while (current != null){
            if (index == indexCurrent){
                previous.next = current.next;
                System.out.println("Removendo... " + current.data);
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

    public void listTexts(){
        List<Node> list = new ArrayList<>();
        if(isEmpty()){
            throw new RuntimeException("Listá vazia.");
        } else {
            Node current = this.head;
            while (current != null){
                list.add(current);
                current = current.next;
            }
            for (Node item : list){
                System.out.print(item.data);
                if (item.next == null){
                    System.out.println();
                } else {
                    System.out.print(" -> ");
                }
            }
        }
    }
}
