import java.util.Comparator;

public interface FilmComparatorFactory {
    Comparator<Film> getComparator();
}
