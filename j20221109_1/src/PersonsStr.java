import java.util.Arrays;

public class PersonsStr {
    private int size= 0;
    private  int capacity=2;
    private Person[] arr = new Person[capacity];



    public boolean add(Person ticket) {
        if (size >= arr.length) {
            enlarge();
        }
        arr[size] = ticket;
        size++;
        return true;
    }

    private void enlarge() {
        arr = Arrays.copyOf(arr, arr.length*2);
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public Person get(int index){
        if(index>=0 && index<size){
            return arr[index];
        }
        return null;
    }
}
