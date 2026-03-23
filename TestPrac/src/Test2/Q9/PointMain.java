package Test2.Q9;

public class PointMain {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        Point point01 = new Point(x, y);
        Point point02 = new Point(x, 5);
        Point point03 = new Point(3, 4);

        boolean xEqualY = point01.equals(point02);
        boolean xEqualY2 = point01.equals(point03);

        System.out.println("point01" +".equlas(" + "point02" + ") : " + xEqualY);
        System.out.println("point01" +".equlas(" + "point03" + ") : " + xEqualY2);

        Point2 point2 = new Point2();

        System.out.println(point2);



    }
}
