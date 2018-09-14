package com.marsrover;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputHandler {

    public static List<String> readFile(String filename) throws IOException {

        List<String> lines = new ArrayList<>();

        File f = new File(filename);
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileLine;

        while ((fileLine = bufferedReader.readLine()) != null)
            lines.add(fileLine);

        bufferedReader.close();
        return lines;
    }

    public static Rover createRover(String roverParams){

        String[] params = roverParams.split(" ");

        int xCoord = Integer.parseInt(params[0]);
        int yCoord = Integer.parseInt(params[1]);
        char dir = params[2].charAt(0);

        return new Rover(xCoord, yCoord, dir);
    }

    public static Zone createZone(String zoneParams){

        String[] params = zoneParams.split(" ");
        int width = Integer.parseInt(params[0]);
        int height = Integer.parseInt(params[1]);

        return  new Zone(width, height);
    }
}
