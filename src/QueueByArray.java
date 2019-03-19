import java.util.Arrays;

public class QueueByArray<T> {
    private T[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public QueueByArray(int capacity) {
          items = (T[])new Object[capacity];
          this.n = capacity;

    }
    //入队
    public boolean enqueue(T t){
        if (tail == n) {
            if (head == 0) { //队列已满
                return false;
            }
            for (int i = head; i < n; i++){
                items[n-head] = items[i];
            }
            tail = n - head;
            head = 0;
        }
        items[tail] = t;
        ++tail;
        return true;
    }
    //出队
    public T dequeue(){
        if (tail == head) return null;
        T temp = items[head];
        ++head;
        return temp;

    }

    //遍历
    public void visit() {
        System.out.println(Arrays.toString(items));
    }
}
