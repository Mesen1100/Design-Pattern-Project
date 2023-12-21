package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.MusicPlayer;

public class MusicPlayerDown implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayerDown(MusicPlayer music){
        this.musicPlayer=music;
    }
    @Override
    public void execute() {
        musicPlayer.volumeDown();
    }
    @Override
    public void undo() {
        musicPlayer.volumeUp();
    }
}
