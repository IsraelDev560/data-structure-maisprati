package linked_list.doublyLinkedList;

import linked_list.doublyLinkedList.exercises.Five;
import linked_list.doublyLinkedList.exercises.Four;
/*
Lista de comandos FOUR:
Está lista aceita diversos tipos :D
 - isEmpty(); - Verifica se a lista está vazia.
 - removeElement(); - Remove o Texto pelo índice.
 - addElement(); - Adiciona um elemento.
 - list(); - Exibe a lista de elementos.
 - undo(); - Desfaz a ultima ação(ou seja exclui o ultimo texto colocado).
 - redo(); - refaz a ultima ação(recupera o ultimo texto colocado).
*/

public class Tests {
    public static void main(String[] args) {
//        Four<Object> four = new Four<>();
//        four.addElement("a");
//        four.addElement(5);
//        four.addElement("ijdsijdjsisdjsidsdjisd");
//        four.removeEllement(1);
//        four.undo();
//        four.list();
//        four.redo();

        Five<Object> five = new Five<>();
        five.addLetter("Copas");
        five.addLetter("Rei");
        five.addLetter("Rainha");
        five.list();
        five.reorganize(2);
        five.list();
    }
}
