public class QueueByLinkedList<T> {
    private LinkedNode head = null;
    private LinkedNode tail = null;
    private int capicity;
    private int count;

    public QueueByLinkedList(int capicity) {
        this.capicity = capicity;
    }

    public boolean enqueue(T t) {
        if (count < capicity) {
            if (head == null) {
                head = tail = new LinkedNode(t);
            } else {
                tail.setNext(new LinkedNode(t));
                tail = tail.getNext();
            }
            ++count;
            return true;
        } else {
            System.out.println("Queue is full.");
            return false;
        }

    }

    public T dequeue() {
        if (head == null || tail == null) {
            System.out.println("Queue is empty");
            return null;

        } else {
            LinkedNode temp = head;
            head = head.getNext();
            --count;
            return (T) temp.getItem();

        }
    }

    public void visit() {

        for (LinkedNode x = head; x != null; x = x.getNext()) {
            System.out.println(x.getItem().toString());

        }
    }
}
