public class Temp {
    private int id;
    public static int counter;


    public Temp(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Temp (id=%d  counter=%d)",id,counter);
    }
}
