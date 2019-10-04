package deque;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 04, 2019
 */
public interface Deque {

    public void pushBack(int value);

    public int popBack();

    public void pushFront(int value);

    public int popFront();

    public boolean isEmpty();


}
