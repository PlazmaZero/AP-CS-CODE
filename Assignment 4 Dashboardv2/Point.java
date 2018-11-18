public class Point {
    private double x; 
    private double y;

    public Point() {
         this (0, 0); 
    }

    public Point(double a, double b) {
        /* missing code */
      x=a;
      y=b;
    }

 

 
public void equals(Point p) {
    System.out.println(x == p.x && y == p.y);
}
}
