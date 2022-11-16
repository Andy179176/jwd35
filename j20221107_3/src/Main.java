import java.util.Random;

public class Main {
    public static void main(String[] args) {


        System.out.println(System.currentTimeMillis());
        Random r = new Random(System.currentTimeMillis());
        int min=-100;
        int max = 100;
        System.out.println();
        System.out.println(r.nextInt(max-min)+min); //0..99
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
/*
        -1193959466
                -1139614796
        837415749
                -1220615319
                -1429538713
*/

        //ArrayProducer arrayProducer= new StaticArrayProducer();
        //arrayConsumer(arrayProducer);

    }

    public static void arrayConsumer(ArrayProducer arrayProducer){
        int[] arr= arrayProducer.getArray();
        for (int ell:arr){
            System.out.println(ell);
        }
    }
}
