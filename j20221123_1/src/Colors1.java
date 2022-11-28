public enum Colors1 {
    GREEN(1, "Зелёный"),
    BLUE(2,"Синий"),
    RED(3,"Красный"),
    BLACK(4,"Черный");

    private int colorCode;
    private String colorName;

    Colors1(int colorCode, String colorName) {
        this.colorCode = colorCode;
        this.colorName = colorName;
    }

    public int getColorCode() {
        return colorCode;
    }

    public String getColorName() {
        return colorName;
    }
}
