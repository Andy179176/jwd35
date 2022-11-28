import java.util.InputMismatchException;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) throws DateNotCorrectException {
        this.day = day;
        this.month = month;
        this.year = year;
        if(!checkDate()) throw new DateNotCorrectException(day,month,year);
    }

    private boolean checkDate(){
        return  (month>=1 && month<=12) && (year>0 );
    }

    @Override
    public String toString() {
        return day +
                "-" + month +
                "-" + year;
    }

    public static MyDate readDateFromScanner(){
        MyDate res= null;


        Scanner sc= new Scanner(System.in);
        int day;
        int month;
        int year;
        try {
            System.out.println("Введите день: ");
            day = sc.nextInt();
            System.out.println("Введите месяц: ");
            month = sc.nextInt();
            System.out.println("Введите год: ");
            year = sc.nextInt();
            return new MyDate(day,month,year);

        } catch (InputMismatchException e){
            System.out.println("Вы должны вводить только цифры");
            return readDateFromScanner();
        } catch (DateNotCorrectException e){
            System.out.println(e.getMsg());
            return readDateFromScanner();
        }
    }
}
