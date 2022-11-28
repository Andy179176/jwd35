public class Child extends Person {
    {
        System.out.println("Child Init Block");
    }
    public Child(String name, int age) {
        super(name, age);
        System.out.println("Child Construct Block");
    }
}
