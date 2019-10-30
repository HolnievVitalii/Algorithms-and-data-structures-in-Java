package lessonEight;

public class App {

    public static void main(String[] args) {
        HashTable table = new HashTable(12);
        table.insert(new DataItem(3));
        table.insert(new DataItem(4));
        table.insert(new DataItem(17));
        table.insert(new DataItem(33));
        table.insert(new DataItem(1));
        table.insert(new DataItem(22));
        table.insert(new DataItem(5));
        table.insert(new DataItem(67));
        table.insert(new DataItem(12));
        table.insert(new DataItem(5));

        table.delete(4);
        table.delete(55);
        System.out.println(table.find(5).toString());
        table.display();
        table.hashCode();


    }
}
