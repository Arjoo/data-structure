package com.arjoo.list;

import java.util.Collection;

/**
 *  list application
 *
 */
class ListApplication<E> {
    Node<E> head;
    
    public void add(E value) {
        Node<E> node = new Node<>(value);
        if(head == null) {
            head = node;
        } else {
            Node<E> temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }


    /**
     * size
     *
     * @return {@link int}
     */
    public int size() {
        int length = 0;
        Node<E> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }


    public void add(int index, E value) {
        if(index < 0) {
            throw new IndexOutOfBoundsException("Index can not be negative");
        }

        if(index > size()) {
            throw new IndexOutOfBoundsException("Index can not be more than its size");
        }

        if(value == null) {
            throw new NullPointerException("Null value are not allowed");
        }

        Node<E> temp = head;
        int position = 0;
        while (position < index-1) {
            temp = temp.next;
            position++;
        }

        Node<E> node = temp.next;
        temp.next = new Node<>(value);
        temp.next.next = node;
    }

    public void addAll(Collection<? extends E> elements) {
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        for (E element : elements) {
            temp.next = new Node<>(element);
            temp = temp.next;
        }
    }

    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
    }
}