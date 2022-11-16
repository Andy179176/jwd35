package telran;

import java.util.Comparator;

public class ComparePersonByNameLength implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().length() - person2.getName().length();
    }
}
