public class Main {
    public static void main(String[] args) {
        /*使用数组实现队列的基本操作
        QueueByArray<String> queue = new QueueByArray<>(5);
        queue.enqueue("dfd");
        queue.enqueue("gfhsfdg");
        queue.enqueue("tttt");
        queue.enqueue("bbbb");
        queue.enqueue("nnnnn");
        queue.visit();
        queue.dequeue();
        queue.visit();
        */
         //使用链表实现队列的基本操作
        QueueByLinkedList<String> queue = new QueueByLinkedList<>(4);
        queue.enqueue("dfd");
        queue.enqueue("gfhsfdg");
        queue.enqueue("tttt");
        queue.enqueue("bbbb");
        queue.enqueue("nnnnn");
        queue.visit();
        queue.dequeue();
        queue.visit();


    }
}
