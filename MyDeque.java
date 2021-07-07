package implementation;

public class MyDeque<E> {
    Node<E> head, tail;
    public void addFirst(E data) {
        Node<E> toAdd = new Node(data);
        if(head == null) {
            head = tail = toAdd;
            return;
        }
        head.next = toAdd;
        toAdd.prev = head;
        head = toAdd;
    }

    public void addLast(E data) {
        Node<E> toAdd = new Node(data);
        if(tail == null) {
            head = tail = toAdd;
            return;
        }
        tail.prev = toAdd;
        toAdd.next = tail;
        tail = toAdd;
    }

    public E removeLast() {
        if(head == null) return null;
        Node<E> toRemove = tail;
        tail = tail.next;
        tail.prev = null;
        if(tail == null) head = null;
        return toRemove.data;
    }

    public E removeFirst() {
        if(tail == null) return null;
        Node<E> toRemove = head;
        head = head.prev;
        head.next = null;
        if(head == null) tail = null;
        return toRemove.data;
    }

    public E peekFirst() {
        if(head == null) return null;
        return head.data;
    }

    public E peekLast() {
        if(tail == null) return null;
        return tail.data;
    }

    public void print() {
        Node<E> temp = tail;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node<E> {
        E data;
        Node<E> prev, next;

        public Node(E data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }
}
