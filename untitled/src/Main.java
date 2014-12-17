/**
 * Created by cu on 16.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Triangle(), new Circle()};
        for(Shape s: shapes){
            s.draw();
        }
        Drawable[] drawables = {new Triangle(), new Circle()};
        for(Drawable s: drawables){
            System.out.println(s.getClass().getSimpleName());
            s.draw();
        }
    }
}
