package CommandPatternMembers.Furnitures;

public class TV {
    private boolean active;
    private int channel;

    public TV(){

    }

    public void on(){
        active=true;
        System.out.println("TV is Open");
        printChannel();
    }

    public void off(){
        active=false;
        System.out.println("Tv is Closed");
    }

    public void up(){
        if(channel<200){
            channel++;
        }
        printChannel();
    }
    public void down(){
        if(channel>0){
            channel--;
        }
        printChannel();
    }

    public void printChannel(){
        System.out.println("Channel is "+ channel);
    }
}
