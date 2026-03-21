package Prac;

class ShapePrinter {
    public void printShapeDetails(Shape shape) {
        System.out.println("---------------------------");
        System.out.println("도형 종류: " + shape.getName());
        System.out.println("계산된 넓이: " + shape.getArea());
        System.out.println("---------------------------");
    }
}