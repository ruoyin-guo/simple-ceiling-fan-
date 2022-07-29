import java.util.ArrayList;
import java.util.List;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    final int OFF = 0;
    private int speed = SLOW;

//    by default, the fan is on
    private boolean isOn = true;
//    by default, the direction is clockwise
    private Direction direction;


//    initialize the state of fan
    public Fan(int speed, Direction d) throws Exception {
        if(speed > 3){
            throw new Exception("speed cannot exceed 3");
        }
        this.speed = speed;
        this.direction = d;
    }



    public Direction getDirection(){
        return this.direction;
    }

    public void setDirection(Direction d){
        this.direction = d;
    }


    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed) throws Exception {
        if(speed > 3){
            throw new Exception("speed cannot exceed 3");
        }
        this.speed = speed;
    }

    public boolean isOn(){
        return this.isOn;
    }

    public void setOff(){
        this.isOn = false;
        this.speed = OFF;
    }



    private pullCord directionControl = new directionControl();
    private pullCord speedControl = new speedControl();

    public void speedUp() throws Exception {
        speedControl.pull(this);
    }

    public void reverseDirection() throws Exception {
        directionControl.pull(this);
    }










}
