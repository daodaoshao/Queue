public class QueueByArray<T> {
    private T[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public QueueByArray(int capacity) {
        items = new T[capacity];

    }
}
