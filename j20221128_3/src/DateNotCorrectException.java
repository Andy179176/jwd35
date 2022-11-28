public class DateNotCorrectException extends Exception {
    private int day;
    private int month;
    private int year;

    public DateNotCorrectException(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getMsg(){
        return String.format("Дата %d-%d-%d не корректна",day,month,year);
    }

}
