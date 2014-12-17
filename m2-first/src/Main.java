/**
 * Created by cu on 09.12.2014.
 */
public class Main {

    public static void main(String[] args) {
        int sum = TestObj.sum(1, 2);


        System.out.println(sum);

        Circle circle = new Circle(10);
        System.out.println(circle.getSquare());

        circle.setRadius(5);
        System.out.println(circle.getSquare());

        Second s1 = new Second();
        System.out.println(Second.amount);
        Second s2 = new Second();
        System.out.println(Second.amount);

        Car car = new Car();
        car.
    }
}
