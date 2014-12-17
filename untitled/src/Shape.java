/**
 * Created by cu on 16.12.2014.
 */
abstract public class Shape implements Drawable {
    abstract String getShapeName();

    @Override
    public void draw() {
        System.out.println("Drawing "+getShapeName());
    }
}
