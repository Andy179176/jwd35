/*
Создать класс Film и полями: название, жанр, рейтинг, год;
        Создать список фильмов. Программа должна спрашивать, какая
        сортировка нужна пользователю (по названию, по рейтингу, по
        жанру или году) и выводить отсортированный список на экран.



 */


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Django freeman", "thriller", 9.2, 2011));
        films.add(new Film("Begining", "action", 9.0, 2018));
        films.add(new Film("Avatar", "fantasy", 9.5, 2005));
        films.add(new Film("Catwomen", "action,fantasy", 9.3, 2007));

        FilmComparatorFactory filmComparatorFactory = new ComparatorForTest();
        printSortedList(films,filmComparatorFactory);
       }

       public static void printSortedList(List<Film> films, FilmComparatorFactory filmComparatorFactory){
           Comparator<Film> comparator= filmComparatorFactory.getComparator();
           while(comparator!=null){
               List<Film> sortedList=sortFilms(films,comparator);
               printList(sortedList);
               comparator= filmComparatorFactory.getComparator();;
           }
       }

       public static void  printList(List<Film> list){
               for (Film f:list){
                   System.out.println(f);
               }
        }



       public static List<Film> sortFilms(List<Film> list, Comparator<Film> filmComparator){

        List<Film> newList= new ArrayList<>(list);
        newList.sort(filmComparator);
        return newList;
       }



}