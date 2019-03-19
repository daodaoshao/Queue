public class Main {
    public static void main(String[] args) {
        QueueByArray<String> queue = new QueueByArray<>(5);
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
