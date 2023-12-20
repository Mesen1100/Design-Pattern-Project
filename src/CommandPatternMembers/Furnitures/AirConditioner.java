package CommandPatternMembers.Furnitures;

public class AirConditioner {
    private boolean active;
    private int speed;
    private int prevspeed;

    public AirConditioner(){
    }
    public void off(){
        active=false;
        prevspeed=speed;
        speed=0;
    }
    public void low(){
        if(speed>0){
            speed--;
        }
    }
    public void high(){
        if(speed<3){
            speed++;
        }
    }
    public void on() {
        active=true;
        speed=prevspeed;
    }
    public int getSpeed(){
        return speed;
    }

}
