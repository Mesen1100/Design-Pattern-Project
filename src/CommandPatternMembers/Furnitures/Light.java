package CommandPatternMembers.Furnitures;

public class Light {

    private boolean active;

    public Light(){

    }

    public void on(){
        active=true;
        System.out.println("Light On");
    }
    public void off(){
        active=false;
        System.out.println("Light Off");
        
    }
}
