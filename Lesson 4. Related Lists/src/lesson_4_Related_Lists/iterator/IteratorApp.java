package lesson_4_Related_Lists.iterator;

import lesson_4_Related_Lists.list.LinkedListImpl;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 13, 2019
 */
public class IteratorApp {
    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        ListIterator iterator = new ListIterator(list);
        iterator.insertAfter("Anton", 33);
        iterator.insertAfter("Garik", 21);
        iterator.deleteCurrent();// delete method check
        iterator.insertBefore("Anna", 12);
        iterator.deleteCurrent();// -//-
        list.display();

        Map map = new HashMap();
        Set set = new TreeSet();
        Set _set = new CopyOnWriteArraySet();
        List _list = new ArrayList();
        _list.iterator();
        map.entrySet().iterator();
        _set.iterator();
        set.iterator();
    }
}
