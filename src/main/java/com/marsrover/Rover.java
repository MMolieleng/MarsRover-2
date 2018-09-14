package com.marsrover;

import com.marsrover.command.ICommand;
import com.marsrover.factories.CommandFactory;

public class Rover {

    private Position position;
    private char direction;
    private Zone zone;

    public Rover(int x, int y, char direction) {

        this.position = new Position(x, y);
        this.direction = direction;
    }

    public void processCommands(String commands) {

        CommandFactory factory = new CommandFactory();

        for (int i = 0; i < commands.length(); i++) {

            try {
                ICommand command = factory.createCommand(commands.charAt(i));
                command.executeCommand(this);
            } catch (IllegalArgumentException e) {

                System.out.println("Unrecognised command \"" + commands.charAt(i) + "\" found and " +
                        "MarsRover is stuck at" + getPosition().toString());
            }
        }
    }

    public Position getPosition() {
        return position;
    }

    public void showPosition() {
        System.out.println(this.getPosition().getX() + " " + this.getPosition().getY() + " " + this.getDirection());
    }

    public String getPositionAndDirection(){
        return this.getPosition().getX() + " " + this.getPosition().getY() + " " + this.getDirection();
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}


