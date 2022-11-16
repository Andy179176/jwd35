import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        PersonsStr people = new PersonsStr();


        ArrayList<Person> people = new ArrayList();
        Person p= new Person("temp tempov", 77);

        people.add(new Person("john",15));
        people.add(new Person("nick",13));
        people.add(new Person("stan",7));
        people.add(p);
        people.add(new Person("jack",10));
        people.add(new Person("ann",12));

        System.out.println(people);

        System.out.println("----------------------------");
        for (Person person:people){
            System.out.println(person);
        }


        System.out.println(" index 1: "+people.get(1));
        System.out.println(" index 2: "+people.get(2));

        System.out.println("size= " + people.size());
        people.remove(0);
        System.out.println("--- 0 removed ...............");
        System.out.println(people);
        System.out.println("size= " + people.size());
        people.remove(p);
        System.out.println("--- temp tempov removed ...............");
        System.out.println(people);
        System.out.println("size= " + people.size());

        System.out.println("----------- strList ------------------");
        ArrayList<String> strList = new ArrayList();

        strList.add("str0");
        strList.add("str1");
        strList.add("str2");
        strList.add("str3");
        strList.add("str4");

        print(strList);
        strList.remove(2);
        System.out.println("2. ----------- strList ------------------");
        print(strList);
        System.out.println("3. ----------- strList ------------------");
        strList.add("str3");
        strList.add("str3");
        strList.add("str888");
        strList.add("str888");
        strList.add("str3");
        strList.add("str3");
        strList.add("str3");
        print(strList);




        for (int i = 0; i < strList.size(); i++) {
            if(strList.get(i).equals("str3")){
                strList.remove(i);
            }
        }
        System.out.println("after removed ......");
        print(strList);

        System.out.println("----------- remove str888");
        for (String str: strList){
            if(str.equals("str888")){
                strList.remove(1);
                strList.remove(1);
            }
        }
        print(strList);





    }
    public static void print(ArrayList<String> list){
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(i + ":  " + list.get(i));
        }
    }





}