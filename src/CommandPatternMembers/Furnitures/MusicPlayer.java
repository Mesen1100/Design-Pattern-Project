package CommandPatternMembers.Furnitures;

public class MusicPlayer {
    private boolean active;
    private int volume;

    public MusicPlayer(){

    }

    public void off(){ 
        active=false;
        System.out.println("Music Player is Off");
    }
    public void volumeUp(){
        if (volume<45){
            volume++;
        }
        getVolume();
    }
    public void volumeDown(){
        if(volume>0){
            volume--;
        }
        getVolume();
    }
    public void on(){
        active=true;
        System.out.println("Music Player is On");
        getVolume();
    }
    public void getVolume(){
        System.out.println("Volume is "+volume);
    } 


}
