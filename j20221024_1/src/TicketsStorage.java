import java.util.Arrays;

public class TicketsStorage {
    private int size;
    private  int capacity;
     private Ticket[] ticketsArray;

    public TicketsStorage(int capacity) {
        this.capacity =capacity;
        ticketsArray = new Ticket[capacity];
        size =0;
    }

    public boolean add(Ticket ticket){
        if(size>=ticketsArray.length){
            enlarge();
        }
        ticketsArray[size]=ticket;
        size++;
        return true;
    }

    private void enlarge() {
/*
        Ticket[] arr= new Ticket[ticketsArray.length*2];
        for (int i=0; i<ticketsArray.length;i++){
            arr[i]=ticketsArray[i];
        }
        ticketsArray=arr;
  */
        ticketsArray= Arrays.copyOf(ticketsArray,ticketsArray.length*2);

    }

    public String toString(){
        String res="";
        for (int i=0; i<ticketsArray.length && i<size;i++){
            res+=ticketsArray[i]+System.lineSeparator();
        }
        res+="---------------"+System.lineSeparator()+ "Total: "+ size +" tickets";
        return res;
    }

    public Ticket get(int index){
        if (index<size) {
            return ticketsArray[index];
        } else {
            return null;
        }
    }

}
