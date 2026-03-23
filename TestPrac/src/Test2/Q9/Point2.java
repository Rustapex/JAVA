package Test2.Q9;

public class Point2 {
    int x;
    int y;

    public Point2() {
        this.x=3;
        this.y=4;
    }

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x +
                "," + y +
                ')';
    }
}
