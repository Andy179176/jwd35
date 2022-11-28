public class Main {
    public static void main(String[] args) {
        Colors color= Colors.BLUE;
        colorPrint(color);

        Car car= new Car("BMW", Colors.RED);

        Car1 car1= new Car1("OPEL", Colors1.BLACK);
        System.out.println(car1);

        System.out.println("------------ DEF ----------");
        drawWithColor(Colors2.DEF);
        System.out.println("------------ GREEN ----------");
        drawWithColor(Colors2.GREEN);
        System.out.println("---------------------------------------");
        System.out.println("Доступные цвета: ");
        for (Colors1 c: Colors1.values()){
            System.out.println(c.getColorName());
        }

    }
    public static void colorPrint(Colors color){
        System.out.println(color.name());
    }

    public static void drawWithColor(Colors2 color){
        color.draw();
        color.qwe();
    }


}

