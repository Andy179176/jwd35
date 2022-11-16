package telran;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" +age +")";
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    /*
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }


    public int compareTo(Person o) {
        if(this.age>o.age) return 100;
        if(this.age<o.age) return -100;
        return 0;
    }

 */
}

class PersonComparatorByAge implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
