import java.util.Arrays;

public class Temp2 {
    private int id;
    private  static int counter=0;
    private String name;


    public Temp2(String name) {
        this.name=name;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return String.format("Temp %s (id=%d  counter=%d)",name,id,counter);
    }



    public static void main(String[] args) {
        Temp2[] temp2s= new Temp2[3];
        temp2s[0]=new Temp2("Jack");
        System.out.println(Arrays.toString(temp2s));
        temp2s[1]=new Temp2("John");
        System.out.println(Arrays.toString(temp2s));
        temp2s[2]=new Temp2("Stan");
        System.out.println(Arrays.toString(temp2s));

        System.out.println("---------------------------------------------");
        for (Temp2 t:temp2s){
            System.out.println(t);
        }
    }
}
