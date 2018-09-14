package com.marsrover.command;

import com.marsrover.Direction;
import com.marsrover.Rover;
import com.marsrover.command.ICommand;

public class TurnLeftCommand implements ICommand {

    @Override
    public void executeCommand(Rover rover) {

        // Turn Left
        switch (rover.getDirection()) {

            case Direction.SOUTH:
                rover.setDirection(Direction.EAST);
                break;

            case Direction.WEST:
                rover.setDirection(Direction.SOUTH);
                break;

            case Direction.NORTH:
                rover.setDirection(Direction.WEST);
                break;

            case Direction.EAST:
                rover.setDirection(Direction.NORTH);
                break;
        }
    }
}
