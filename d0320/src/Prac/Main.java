package Prac;

class Main {

    Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getArea(){
        return  getArea();
    }

    public static void main(String[] args) {

//        setShape()
        ShapePrinter printer = new ShapePrinter();

        Circle c = new Circle();
        c.setRadius(5);
        
        Rectangle r = new Rectangle();
        r.setWidth(4);
        r.setHeight(6);

        printer.printShapeDetails(c);
        printer.printShapeDetails(r);

        printer.printShapeDetails(new Shape() {
            @Override
            public double getArea() {
                return 15.5;
            }

            @Override
            public String getName() {
                return "임의의 도형";
            }
        });
    }
}