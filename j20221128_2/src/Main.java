import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        String msg="msg: qwertyuiop[";



        int res=0;
        res= div(a, b,msg);

        /*try {
            res= div(a, b,msg);
        } catch (ArithmeticException e){
            System.out.println("Программа не может быть выполнена, т.к b=0");
            return;
        } catch (NullPointerException e){
            //System.out.println("catch EXCEPTION ");
            res= div(a, b,"");
        } finally {
            System.out.println("Выполнили деление");
        }*/

        System.out.println(res);

        readFile("qwertyu");

    }


    public static int div(int a, int b, String msg){
        int res=a/b;
        System.out.println(msg.toUpperCase());

        return res;
    }

    public static String readFile(String n) throws IllegalArgumentException{
        if(n.indexOf('.')==-1) {
            throw new IllegalArgumentException();
        }
        try {
            FileReader f= new FileReader("12345679876543.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }



}