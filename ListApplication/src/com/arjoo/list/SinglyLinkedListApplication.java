package com.arjoo.list;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

/**
 * list application
 */
class SinglyLinkedListApplication<E> {
    Node<E> head;

    public void add(E value) {
        Node<E> node = new Node<>(value);
        if (head == null) {
            head = node;
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
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
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index can not be negative");
        }

        if (index > size()) {
            throw new IndexOutOfBoundsException("Index can not be more than its size");
        }

        if (value == null) {
            throw new NullPointerException("Null value are not allowed");
        }

        Node<E> temp = head;
        int position = 0;
        while (position < index - 1) {
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

        if (index < 0) {
            throw new IndexOutOfBoundsException("Index can not be negative");
        }

        if (index > size()) {
            throw new IndexOutOfBoundsException("Index can not be more than its size");
        }


        Node<E> temp = head;
        int position = 0;
        while (position < index - 1) {
            position++;
            temp = temp.next;
        }
        Node<E> node = temp.next;
        for (E element : elements) {
            if (element == null) {
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
            if (temp.value.equals(e)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public E get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index can not be negative");
        }

        if (index > size()) {
            throw new IndexOutOfBoundsException("Index can not be more than its size");
        }

        int in = 0;
        Node<E> temp = head;
        while (in < index - 1) {
            in++;
            temp = temp.next;
        }
        return temp.next.value;
    }

    public int indexOf(Object o) {
        E e = (E) o;
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.value.equals(e)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void printInReverseOrder() {
        Node<E> temp = head;
        printInReverseOrder(temp);
    }

    private void printInReverseOrder(Node<E> head) {
        if (head == null) {
            return;
        }
        printInReverseOrder(head.next);
        System.out.print(head.value + ", ");
    }

    public void reverse() {
        Node<E> current = head;
        Node<E> next;
        Node<E> prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void reverseRecursive() {
        head = reverseRecursive(head);
        print();
    }

    private Node<E> reverseRecursive(Node<E> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<E> reverse = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return reverse;
    }

    public Optional<E> retrieveFirst() {
        if (head == null) {
            return null;
        }
        return Optional.of(head.value);
    }


    public void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> middle(Node<E> head) {
        if (head == null)
            return null;
        Node<E> first = head;
        Node<E> second = head;

        while (second.next != null && second.next.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }

    public Node<E> mergeSort(Node<E> head, Comparator<Number> comparator) {
        if (head == null || head.next == null)
            return head;

        Node<E> middle = middle(head);
        Node<E> middleNode = middle.next;
        middle.next = null;
        Node<E> left = mergeSort(head, comparator);
        Node<E> right = mergeSort(middleNode, comparator);

        return merge(left, right, comparator);
    }

    private Node<E> merge(Node<E> left, Node<E> right, Comparator<Number> comparator) {
        Node<E> result = null;
        if (left == null)
            return right;
        if (right == null)
            return left;

        if (comparator.compare((Number) left.value, (Number) right.value) <= 0) {
            result = left;
            result.next = merge(left.next, right, comparator);
        } else {
            result = right;
            result.next = merge(left, right.next, comparator);
        }
        return result;
    }

    public Node<E> sort(Node<E> head, Comparator<Number> comparator) {
        return mergeSort(head, comparator);
    }
}