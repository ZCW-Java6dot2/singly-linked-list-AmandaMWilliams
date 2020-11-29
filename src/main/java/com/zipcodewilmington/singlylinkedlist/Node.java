package com.zipcodewilmington.singlylinkedlist;

public class Node<SomeType> {
    private Node next;
    private SomeType data;
    private int index = 0;


    public Node(SomeType data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(SomeType data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }



    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public SomeType getData() {
        return data;
    }

    public void setData(SomeType data) {
        this.data = data;
    }
}
