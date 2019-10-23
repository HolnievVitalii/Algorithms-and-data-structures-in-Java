package lessonSix;

public class Node {
    int size;
    Person person;
    Node leftChild;
    Node rightChild;
    int depth;


    void display() {
        System.out.println(String.format("Name %s age %d", person.id));
    }








}
