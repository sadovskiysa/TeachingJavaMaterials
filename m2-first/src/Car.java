/**
 * Created by cu on 09.12.2014.
 */
public class Car {
    boolean isStart;
    boolean isInMove;
    int speed;

    public void startEngine(){
        isStart = true;
    }

    public void stopEngine(){
        isStart = false;
    }

    public void startMoving(){
        isInMove = true;
    }

    public void stopMoving(){
        isInMove = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
