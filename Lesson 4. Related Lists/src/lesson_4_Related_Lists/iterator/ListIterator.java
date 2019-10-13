package lesson_4_Related_Lists.iterator;

import lesson_4_Related_Lists.list.Link;
import lesson_4_Related_Lists.list.LinkedListImpl;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 13, 2019
 */
public class ListIterator {
    private Link current;

    private Link prev;
    private LinkedListImpl list;

    public ListIterator(LinkedListImpl list) {
        this.list = list;
        reset();
    }

    private void reset() {
        current = list.getFirst();
        prev = null;
    }

    public void nextLink() {
        prev = current;
        current = current.next;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(String name, int age) {
        Link link = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(link);
            current = link;
        } else {
            link.next = current.next;
            current.next = link;
            nextLink();
        }
    }

    public void insertBefore(String name, int age) {
        Link link = new Link(name, age);
        if (prev == null) {
            link.next = list.getFirst();
            list.setFirst(link);
            reset();
        } else {
            link.next = prev.next;
            prev.next = current = link;
        }
    }

    /**
     * NOOP
     */
    public String deleteCurrent() {
        String name = current.name;
        if (prev == null) {
            list.setFirst(current.next);
            reset();
        } else {
            prev.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return name;
    }
}
