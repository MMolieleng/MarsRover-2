package com.marsrover.command;

import com.marsrover.Rover;
import com.marsrover.Zone;
import com.marsrover.command.ICommand;

public class MoveCommand implements ICommand {

    @Override
    public void executeCommand(Rover rover) {

        if (validMove(rover)){
            rover.getPosition().shiftPosition(rover.getDirection());
        }else{
            throw new IllegalArgumentException("Rover can not go beyond this point "+ rover.getPositionAndDirection());
        }
    }

    public boolean validMove(Rover rover){

        Zone zone = rover.getZone();

        int posX = rover.getPosition().getX();
        int posY = rover.getPosition().getY();

        if ( (posX == zone.getLowerBoundX()) || (posX ==  zone.getUpperBoundX()))
            return false;

        if ((posY == zone.getLowerBoundY()) || ( posY == zone.getUpperBoundY()))
            return false;
        return true;
    }
}