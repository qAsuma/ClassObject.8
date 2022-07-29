package Animal;
//Используя Intelij IDEA создать проект, пакет. Создать класс Animal с именем String, возрастом int, хвостом Boolean.
// В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
// В классе Animal переопределить методы equals & hashCode.

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;


    }


    @Override
    public String toString() {
        return "Animal{" +
                "Имя='" + name + '\'' +
                ", Возораст=" + age +
                ", Хвост=" +  tail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
