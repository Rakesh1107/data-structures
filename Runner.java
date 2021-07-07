package implementation;

public class Runner {
    public static void main(String[] args) {
//        MyQueue<Integer> mq = new MyQueue<>();
//        mq.enqueue(1);
//        mq.enqueue(2);
//        mq.enqueue(3);
//        mq.enqueue(4);
//        System.out.println(mq.peek());
//        System.out.println(mq.dequeue());
//        mq.print();
//        System.out.println(mq.peek());
//        System.out.println(mq.dequeue());
//        mq.enqueue(5);
//        System.out.println(mq.peek());
//        mq.print();
        MyDeque<Integer> md = new MyDeque<Integer>();
        md.addFirst(15);
        md.addFirst(25);
        md.addLast(45);
        md.addLast(55);
        md.print();
        System.out.println(md.removeLast());
        System.out.println(md.removeFirst());
        md.print();
        md.addLast(30);
        md.addLast(40);
        md.print();
        System.out.println(md.peekFirst());
        System.out.println(md.peekLast());
    }
}
