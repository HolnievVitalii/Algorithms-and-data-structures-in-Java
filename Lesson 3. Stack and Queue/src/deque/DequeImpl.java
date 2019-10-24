package deque;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 04, 2019
 */
public class DequeImpl implements Deque {

    int size;
    int head;
    int tail;
    int[] deque;

    public DequeImpl(int size) {
        deque = new int[this.size = size];
    }

    @Override
    public void pushBack(int value) {
        if (++tail == size)
            tail = 0;
        deque[tail] = value;
    }

    @Override
    public int popBack() {
        int ret = deque[tail];
        if (--tail < 0)
            tail = size - 1;
        return ret;
    }

    @Override
    public void pushFront(int value) {
        deque[head] = value;
        if (--head < 0)
            head = size - 1;
    }

    @Override
    public int popFront() {
        if (++head == size)
            head = 0;
        return deque[head];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }
}
