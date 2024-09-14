package linked_list.singlyLinkedList;

/*
2. Crie uma aplicação que simule o histórico de navegação de um navegador
   utilizando uma lista simplesmente encadeada. Implemente funcionalidades
   para adicionar novas URLs e remover URLs antigas quando a lista atingir
   um certo tamanho.
 */

import linked_list.Node;

public class Two {
    private Node head;
    private final int quantidadeMaxima = 2;
    private int quantidade;

    public Two(){
        this.head = null;
        this.quantidade = 0;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addUrl(String data){
        Node newNode = new Node(data);
        if(isEmpty()){
            this.head = newNode;
            System.out.println("Adicionando.. " +newNode.data);
            this.quantidade = 1;
        } else{
            if(quantidade == quantidadeMaxima){
                System.out.println("Quantidade maxima alcançada, removendo a primeira URL "+ newNode.data);
                this.head = this.head.next;
                quantidade--;
            }
            Node current = this.head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            quantidade++;
        }
    }
}
