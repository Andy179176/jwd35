public class Singleton {
    private static Singleton instance = null;
    private  String name;

    private Singleton(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Singleton getInstance(String name) {
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;
    }
}



