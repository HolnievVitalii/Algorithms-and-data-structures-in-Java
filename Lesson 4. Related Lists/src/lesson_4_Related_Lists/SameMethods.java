package lesson_4_Related_Lists;

import lesson_4_Related_Lists.list.Link;
import lesson_4_Related_Lists.list.LinkedList;
import lesson_4_Related_Lists.list.LinkedListImpl;

/**
 * @implNote  an abstract class has
 * been created that combines
 * the same common methods that use the
 * DoubleLinkedListImpl and LinkedListImpl classes
 *
 * @author holnievvitalii@outlook.com
 * @version dated Oct 13, 2019
 */
public abstract class SameMethods {
    public Link first;

    public Link find(String name) {
        Link current = first;
        while (current.name != name) {
            if (current.name == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public void insertFirst(String name, int age) {
        Link newLink = new Link(name, age);
        newLink.next = first;
        first = newLink;
    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link delete(String name) {
        Link current = first;
        Link prev = first;
        while (current.name != name) {
            if (current.name == null) {
                return null;
            } else {
                prev = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            prev.next = current.next;
        return current;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }
}

