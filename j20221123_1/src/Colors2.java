public enum Colors2 {
    GREEN
            {
                @Override
                public void draw() {
                    System.out.println("Рисую зеленым");
                }
            },
    BLUE
            {
                @Override
                public void draw() {
                    System.out.println("Рисую синим");
                }
            },
    RED
            {
                @Override
                public void draw() {
                    System.out.println("Рисую красным");
                }
            },

    BLACK
            {
                @Override
                public void draw() {
                    System.out.println("Рисую черным");
                }
            },
    DEF{
        @Override
        public void draw() {
            System.out.println("Рисую черным c полосками");
        }
        public void qwe(){
            System.out.println("Реализация qwe для" + this.name() +"значения");
        }
    };

    public  abstract void draw();
    public  void qwe(){
        System.out.println("дефолтный метод qwe ");
    };
}
