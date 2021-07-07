package implementation;

public class MyStack<E> {
    private MyLinkedList<E> ll = new MyLinkedList<>();

    public void push(E e) {
        ll.add(e);
    }

    public E pop() throws Exception {
        if(ll.isEmpty()) {
            throw new Exception("Empty Stack");
        }
        return ll.removeLast();
    }
    public E peek() throws Exception {
        if(ll.isEmpty()) {
            throw new Exception("Empty Stack");
        }
        return ll.getLast();
    }
    public void print() {
        ll.print();
    }
}
