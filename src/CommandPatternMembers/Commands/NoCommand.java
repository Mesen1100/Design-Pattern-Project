package CommandPatternMembers.Commands;

import CommandPattern.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No Command Assigned!");
    }

    @Override
    public void undo() {
        System.out.println("No Command Assigned!");
    }
    
}
