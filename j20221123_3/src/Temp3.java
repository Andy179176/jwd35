import java.util.Arrays;

public class Temp3 {
    private int id;
    private  static int counter=0;
    private String name;


    public Temp3(String name) {
        this.name=name;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return String.format("%s (id=%d  counter=%d)",name,id,counter);
    }


    public static void print(){
        System.out.printf("В нашей програме %d объектов класса Temp3%n", counter);
    }

    public static void main(String[] args) {
        Temp3.print();
        Temp3[] temp2s= new Temp3[3];
        temp2s[0]=new Temp3("Jack");
        System.out.println(Arrays.toString(temp2s));
        Temp3.print();
        temp2s[1]=new Temp3("John");
        System.out.println(Arrays.toString(temp2s));
        Temp3.print();
        temp2s[2]=new Temp3("Stan");
        System.out.println(Arrays.toString(temp2s));
        Temp3.print();

        System.out.println("---------------------------------------------");
        for (Temp3 t:temp2s){
            System.out.println(t);
        }
    }
}
