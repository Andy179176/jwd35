public class Car1 {
    private String model;
    private Colors1 color;

    public Car1(String model, Colors1 color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return model + " " + color.getColorName()+"("+color.getColorCode()+")";
    }
}
