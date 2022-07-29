public class speedControl implements pullCord{

    @Override
    public void pull(Fan fan) throws Exception {
        if(fan.getSpeed() == 3){
            fan.setOff();
        }else{
            int new_speed = fan.getSpeed() + 1;
            fan.setSpeed(new_speed);
        }

        System.out.println("speed change to " + fan.getSpeed() );

    }
}
