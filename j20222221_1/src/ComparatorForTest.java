import java.util.Comparator;
import java.util.Random;

public class ComparatorForTest implements FilmComparatorFactory {
    @Override
    public Comparator<Film> getComparator() {
        Random rnd=new Random(System.currentTimeMillis());
        return rnd.nextInt(100)>50?new ComparatorByYear():null;
    }
}
