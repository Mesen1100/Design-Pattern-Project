package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.MusicPlayer;

public class MusicPlayerUp implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerUp(MusicPlayer music){
        this.musicPlayer=music;
    }
    @Override
    public void execute() {
        musicPlayer.volumeUp();
    }
    @Override
    public void undo() {
        musicPlayer.volumeDown();
    }
    public String toString(){
        return "Music Player Volume Up Button";
    }
}
