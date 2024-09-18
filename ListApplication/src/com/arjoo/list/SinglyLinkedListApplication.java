package com.arjoo.list;

import java.util.Collection;

/**
 *  list application
 *
 */
class SinglyLinkedListApplication<E> {
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

    public void addAll(int index, Collection<? extends E> elements) {

        if(index < 0) {
            throw new IndexOutOfBoundsException("Index can not be negative");
        }

        if(index > size()) {
            throw new IndexOutOfBoundsException("Index can not be more than its size");
        }


        Node<E> temp = head;
        int position = 0;
        while (position < index -1){
            position++;
            temp = temp.next;
        }
        Node<E> node = temp.next;
        for (E element : elements) {
            if(element == null) {
                throw new NullPointerException("Null value are not allowed");
            }

            temp.next = new Node<>(element);
            temp = temp.next;
        }
        temp.next = node;
    }

    public void clear() {
        head = null;
    }

    public boolean contains(E e) {
        Node<E> temp = head;
        while (temp != null) {
            if(temp.value.equals(e)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public E get(int index) {
        if(index < 0) {
            throw new IndexOutOfBoundsException("Index can not be negative");
        }

        if(index > size()) {
            throw new IndexOutOfBoundsException("Index can not be more than its size");
        }

        int in = 0;
        Node<E> temp = head;
        while (in < index-1) {
            in++;
            temp = temp.next;
        }
        return temp.next.value;
    }

    public int indexOf(Object o) {
        E e = (E)o;
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if(temp.value.equals(e)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
    }
}