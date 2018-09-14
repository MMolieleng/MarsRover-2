package com.marsrover;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage : sh run.sh [filename]");
            return;
        }
        new Main().init(args);
    }


    public void init(String... args) {

        try {

            List<String> instructions = InputHandler.readFile(args[0]);
            Zone zone = InputHandler.createZone(instructions.get(0));

            Rover rover = InputHandler.createRover(instructions.get(1));
            rover.setZone(zone);
            rover.processCommands(instructions.get(2));
            rover.showPosition();

        } catch (Exception e) {
            System.out.println("ERROR : ");
            System.out.println(e.getMessage());
        }
    }
}
