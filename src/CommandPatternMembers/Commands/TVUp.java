package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.TV;

public class TVUp implements Command{
    private TV tv;

    public TVUp(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.up();
    }
    @Override
    public void undo() {
        tv.down();
    }
    public String toString(){
        return "TV Channel Up Button";
    }
}
