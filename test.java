public class test {

    public static void main(String[] args) throws Exception {
        Fan fan = new Fan(1, Direction.CLOCKWISE);
        fan.speedUp();
        fan.speedUp();
        fan.speedUp();
        fan.reverseDirection();
        fan.reverseDirection();
        fan.reverseDirection();

    }



}
