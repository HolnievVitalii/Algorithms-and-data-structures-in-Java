package lesson_4_Related_Lists.list;

/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 13, 2019
 */
public class Link {
    public String name;
    public int age;
    public Link next;

    public Link(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(String.format("name %s age %d", name, age));
    }
}
