public class Main {
    public static void main(String[] args) {
        Temp t1= new Temp(1);
        Temp t2= new Temp(2);
        System.out.println(t2);

        Temp.counter=10;
        System.out.println("------------------------");
        System.out.println(t1);
        System.out.println(t2);
        t1.counter=20;
        System.out.println("2. ------------------------");
        System.out.println(t1);
        System.out.println(t2);


        System.out.println("--------------- 1 --------------------");
        //Singleton obj= new Singleton("qwe");
        Singleton obj= Singleton.getInstance("Jack");
        System.out.println(obj);

    }
}