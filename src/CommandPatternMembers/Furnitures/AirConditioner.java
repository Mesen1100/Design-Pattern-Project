package CommandPatternMembers.Furnitures;

public class AirConditioner {
    private boolean active;
    private int speed;

    public AirConditioner(){
    }
    public void off(){
        active=false;
        speed=0;
        System.out.println("Air Conditioner Off");
    }
    public void low(){
        
        if(speed>1){
            speed--;
        }
        System.out.println("Air Conditioner Speed: "+speed );
    }
    public void high(){
        if(speed<3){
            speed++;
        }
        System.out.println("Air Conditioner Speed: "+speed );
    }
    public void on() {
        active=true;
        if(speed==0){
            speed=1;
        }
        System.out.println("Air Conditioner On");
    }
    public int getSpeed(){
        return speed;
    }

}
