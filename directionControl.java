import java.rmi.server.ExportException;

public class directionControl implements pullCord {


    @Override
    public void pull(Fan fan) throws Exception {

        if(!fan.isOn()){
            throw new Exception("the fan is OFF, please turn it on first");
        }
        Direction cur = fan.getDirection();
        if(cur == Direction.CLOCKWISE){
            fan.setDirection(Direction.COUNTERCLOCKWISE);
        }else{
            fan.setDirection(Direction.CLOCKWISE);
        }

        System.out.println("direction reversed to "+ fan.getDirection());

    }
}
