package queue;

import queue.exercises.Six;

public class Tests {
    public static void main(String[] args) {
        Six six = new Six();
        six.enqueue("Carlos");
        six.enqueue("Cabrito");
        six.enqueue("Carlao");
        six.list();
        six.dequeue();
        six.list();
    }
}
