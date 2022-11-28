import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyDate d1= MyDate.readDateFromScanner();
        System.out.println(d1);


        try {
            MyDate m2= new MyDate(10,11,2000);

        } catch (DateNotCorrectException e) {

            throw new RuntimeException(e);
        }
    }




}