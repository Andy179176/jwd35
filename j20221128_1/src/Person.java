import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private static int[] arr = new int[1500];
    public static  Person INSTANCE;


    static {
        System.out.println("Array");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=i;
        }
    }


    public static void print(Person p) {
        System.out.println("Person{" +
                "name='" + p.name + '\'' +
                ", age=" + p.age +
                '}');

    }



    public Person(String name, int age) {
        System.out.println(" Construct:");
        this.name = name;
        this.age = age;
    }

    private  Person getInstance(String name, int age){
        if (INSTANCE==null){
            INSTANCE=new Person(name,age);
        }
        return INSTANCE;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
