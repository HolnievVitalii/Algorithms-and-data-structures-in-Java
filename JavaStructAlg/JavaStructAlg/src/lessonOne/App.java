package lessonOne;

public class App {

    public static void main(String[] args) {
//        int a = 1;
//        ch(a);
//        Person p = new Person("Name");
//        ch(p);
//        System.out.println(p.name);
////        null

        /**
         * primitive
         */
//        int a = 5;
//        int b = 5;
//
//        if (a == b) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

//        String q1 = "1";
//        String q2 = "1";
//        System.out.println(q1.equals(q2));

        /**
         * objects
         */
        Person p = new Person("Name");
        Person p1 = new Person("Name");
//        Dog d = new Dog("Name");
//
//        if (p.equals(d)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//

//        if (p.equals(p1)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//        int w = 1;
//        String s = "1";
//        s.equals(w);

        Person s = new Person("object");
        Person s1 = s;
        System.out.println((s == s1) + "\n");

        Integer a = new Integer(6);
        Integer b = new Integer(5);
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }

    static void ch(Person a) {
        a.name = "qwerty";
//        System.out.println(a);

    }

}
