public class Author {
    private String fName;
    private String lName;
    private MyDate birthday;

    public Author(String fName, String lName, MyDate birthday) {
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
    }

    public String getName() {
        return fName +" "+ lName;
    }

    public String toString(){
        return  fName.charAt(0) + "."+ lName + "("+ birthday.toString()+ ")";
    }
}
