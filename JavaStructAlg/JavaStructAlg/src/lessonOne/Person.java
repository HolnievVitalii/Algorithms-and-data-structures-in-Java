package lessonOne;

import java.util.Objects;

class Person {

    String name;
    int age;
    double salary;

    Person(String name) {
        this.name = name;
    }

    public void pay() {
        System.out.println("Оплата коммунальных счетов");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        System.out.println("Что хочу то и делаю");
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(salary, person.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
