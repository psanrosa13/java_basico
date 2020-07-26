package java14;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;// instanceof é um recurmo de teste
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
