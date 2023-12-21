package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.MusicPlayer;

public class MusicPlayerOff implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerOff(MusicPlayer music){
        this.musicPlayer=music;
    }

    @Override
    public void execute() {
        musicPlayer.off();
    }

    @Override
    public void undo() {
        musicPlayer.on();
    }

}
