package deque;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 04, 2019
 */
public class App {
    public static void main(String[] args) {
        DequeImpl deque = new DequeImpl(5);
        deque.pushFront(4);
        deque.pushFront(3);
        deque.pushFront(1);
        deque.popBack();
        deque.popFront();
        deque.pushBack(6);
        while (!deque.isEmpty()) {
            int n = deque.popBack(); //popBack() actually equals remove() like in queue
            System.out.println(n);
        }
    }
}
