package com.nc.designpattern.Iterator.v5;


public class LinkedList_ implements Collection_ {
    Node head = null;
    Node tail = null;
    private int size = 0;

    @Override
    public void add(Object o) {
        Node n = new Node(o);
        n.next = null;

        if (head == null) {
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return null;
    }

    private class Node {
        private Object o;
        Node next;
        public Node (Object o) {
            this.o = o;
        }
    }

}
