/**
 * Created by cu on 09.12.2014.
 */
public class Circle {
    private int radius;
    private double square;

    public Circle(){
        radius = 4;
    }

    public Circle(int r) {
        radius = r;
    }

    public void setRadius(int r){
        radius = r;
    }

    public double getSquare(){
        return Math.PI * Math.pow(radius, 2);
    }
}
