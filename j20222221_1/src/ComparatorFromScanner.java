import java.util.Comparator;
import java.util.Scanner;

public class ComparatorFromScanner implements FilmComparatorFactory {
    @Override
    public Comparator<Film> getComparator() {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("1. sort by title  ");
        System.out.print("2. sort by genre  ");
        System.out.print("3. sort by rating  ");
        System.out.print("4. sort by year  ");
        System.out.print("0. exit  ");
        System.out.println();

        int item = sc.nextInt();
        Comparator<Film> filmComparator=null;
        switch (item) {
            case 1:
                filmComparator=new ComparatorByTitle();
                break;
            case 2:
                filmComparator=new ComparatorByGenre();
                break;
            case 3:
                filmComparator=new ComparatorByRating();

                break;
            case 4:
                filmComparator=new ComparatorByYear();
                break;
        }
        return filmComparator;
    }
}
