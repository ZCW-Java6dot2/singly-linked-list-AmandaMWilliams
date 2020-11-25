package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<SomeType> {

    private int listCount;
    private Node<SomeType> head;
    private Node<SomeType> tail;
    private int length;

    public SinglyLinkedList() {
        tail = null;
        head = null;
        length = 0;
    }

    private class Node<SomeType> {
        private Node next;
        private SomeType data;
        private int index = 0;

        public Node(SomeType dataValue, Node next) {
            this.data = dataValue;
            this.next = null;
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

        @SuppressWarnings("unused")
        public void setData(SomeType data) {
            this.data = data;
        }

        public int getIndex(int index) {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    public void addFirstElement(Node obj) {
        head = new Node<SomeType>(obj, null);
        head.setIndex(0);
    }

    public void addSecondElement(Node obj) {
        tail = new Node<SomeType>(obj, null);
        head.setNext(tail);
        tail.setIndex(1);
    }

    public void addThirdElementOnward(Node obj) {
        int nextIndex = tail.getIndex() + 1;
        tail.setNext(new Node<SomeType>(obj, null));
        tail = tail.getNext();
        tail.setIndex(nextIndex);
    }

    public void add(Node data){
        if (head == null)
            addFirstElement(data);
    }

    public void shiftIndex(Node<SomeType> node, int currentIndex){
        while(node != null){
            node.setIndex(currentIndex);
            node = node.getNext();
            currentIndex++;
        }
    }
}

