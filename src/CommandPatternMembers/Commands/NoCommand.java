package CommandPatternMembers.Commands;

import CommandPattern.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No Command Assigned!");
    }
    
}
