package com.marsrover.command;

import com.marsrover.Direction;
import com.marsrover.Rover;
import com.marsrover.command.ICommand;

public class TurnRightCommand implements ICommand {

    @Override
    public void executeCommand(Rover rover) {

        // Turn Right
        switch (rover.getDirection()) {

            case Direction.SOUTH:
                rover.setDirection(Direction.WEST);
                break;
            case Direction.EAST:
                rover.setDirection(Direction.SOUTH);
                break;
            case Direction.NORTH:
                rover.setDirection(Direction.EAST);
                break;
            case Direction.WEST:
                rover.setDirection(Direction.NORTH);
                break;
        }
    }
}
