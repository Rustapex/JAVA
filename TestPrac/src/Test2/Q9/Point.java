package Test2.Q9;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public boolean equals(Object object) {
        if ((object instanceof Point point)){
            Point point1 = (Point) object;
            if(this.x == point1.x && this.y == point1.y){
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

}
