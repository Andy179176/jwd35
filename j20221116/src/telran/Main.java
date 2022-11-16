package telran;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>  list = new ArrayList<>();
        list.add("Jack1765");
        list.add("Nick13");
        list.add("John436");
        list.add("Stan12345678");

        System.out.println("------- print list -----------");
        for (String s: list){
            System.out.println(s);
        }
        System.out.println("------- print list size -----------");
        System.out.println(list.size());

        System.out.println("------- print the first element -----------");
        System.out.println(list.get(0));

        System.out.println("------- print sorted list -----------");
        list.sort(new ComparatorStringsByLength());
        System.out.println(list);

        System.out.println("------------- sort by def ------------------------------");
        Person[] people=personArray();
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        //people[0].compareTo(people[1]);
        System.out.println("------------- sort by name ------------------------------");
        Arrays.sort(people,new ComparePersonByName());
        System.out.println(Arrays.toString(people));

        System.out.println("------------- sort by name length ------------------------------");
        Arrays.sort(people,new ComparePersonByNameLength());
        System.out.println(Arrays.toString(people));

        System.out.println("------------- sort by default ------------------------------");
        String[] str=strArray();
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        System.out.println("------------- sort by length ------------------------------");

        Arrays.sort(str,new ComparatorStringsByLength());
        System.out.println(Arrays.toString(str));

    }

    static  public String[] strArray(){
        String s1="fff";
        String s2="lsfyui";
        String s3="wr";

        String[] strings = new String[3];

        strings[0]=s1;
        strings[1]=s2;
        strings[2]=s3;



        return strings;
    }


    static public Person[] personArray(){
        Person s1=new Person("Jack",20);
        Person s2=new Person("John",25);
        Person s3=new Person("Ann",22);
        Person s4=new Person("Bert-Nickolaus",22);

        Person[] strings = new Person[4];

        strings[0]=s1;
        strings[1]=s2;
        strings[2]=s3;
        strings[3]=s4;



        return strings;
    }

}