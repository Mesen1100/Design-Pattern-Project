package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.MusicPlayer;

public class MusicPlayerOn implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerOn (MusicPlayer music){
        this.musicPlayer=music;
    }

    @Override
    public void execute() {
        musicPlayer.on();
    }

    @Override
    public void undo() {
        musicPlayer.off();
    }

}
