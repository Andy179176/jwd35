public class TempClass {
    private int f;

    public TempClass(String str){
        f=str.length();
    }
    public TempClass(String str, String str2, String str3){
        f=str.length() +str2.length()+str3.length();
    }

    public TempClass(){
        f=0;
    }
}
