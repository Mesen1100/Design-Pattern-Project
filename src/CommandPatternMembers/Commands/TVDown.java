package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.TV;

public class TVDown implements Command{
    private TV tv;

    public TVDown (TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.down();
    }

    @Override
    public void undo() {
        tv.up();
    }
    public String toString(){
        return "TV Channel Down Button";
    }
}
