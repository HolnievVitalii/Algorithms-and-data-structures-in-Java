package lesson_4_Related_Lists.list;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 13, 2019
 */
public class LinkedListApp {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        ArrayList arrayList;
        LinkedListImpl customList = new LinkedListImpl();
        customList.insertFirst("Ivan", 23);
        customList.insertFirst("Kate", 17);
        customList.insertFirst("John", 33);

        customList.display();
        System.out.println();

        if (!customList.isEmpty()) {
//            customList.delete();
            customList.delete("Kate");
        }

        customList.display();

//        System.out.println(customList.find("Ivan"));

    }
}
