public class Person {
    private  String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return name + "(" +age +")";
    }
}
