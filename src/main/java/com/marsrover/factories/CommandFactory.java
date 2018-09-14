package com.marsrover.factories;

import com.marsrover.command.ICommand;
import com.marsrover.command.MoveCommand;
import com.marsrover.command.TurnLeftCommand;
import com.marsrover.command.TurnRightCommand;

public class CommandFactory {

    public CommandFactory() { }

    public static ICommand createCommand(char type) {

        switch (type) {
            case 'L':
                return new TurnLeftCommand();
            case 'R':
                return new TurnRightCommand();
            case 'M':
                return new MoveCommand();
            default:
                throw new IllegalArgumentException("Invalid command " + type);
        }
    }
}
