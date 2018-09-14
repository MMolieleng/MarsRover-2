
import com.marsrover.Direction;
import com.marsrover.Rover;
import com.marsrover.Zone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTests {

    @Test
    void intit(){

        //Inputs
        // Zone = 0 0
        Zone zone = new Zone(0, 0);

        Rover rover = new Rover(1, 1, Direction.EAST);
        rover.setZone(zone);
        rover.processCommands("");

        assertEquals("1 1 E", rover.getPositionAndDirection());
    }

    @Test
    void canTurnLeft() throws Exception{

        Zone zone = new Zone(6, 6);

        Rover rover = new Rover(1, 1, Direction.EAST);
        rover.setZone(zone);
        rover.processCommands("L");

        assertEquals("1 1 N", rover.getPositionAndDirection());
    }

    @Test
    void canTurnRight() throws Exception {


        Zone zone = new Zone(6, 6);

        Rover rover = new Rover(1, 1, Direction.EAST);
        rover.setZone(zone);
        rover.processCommands("R");

        assertEquals("1 1 S", rover.getPositionAndDirection());
    }

    @Test
    void canMoveSouth() throws Exception{

        Zone zone = new Zone(6, 6);

        Rover rover = new Rover(1, 1, Direction.SOUTH);
        rover.setZone(zone);
        rover.processCommands("M");

        assertEquals("1 0 S", rover.getPositionAndDirection());
    }

    @Test
    void canMoveNorth(){

        Zone zone = new Zone(6, 6);

        Rover rover = new Rover(1, 1, Direction.NORTH);
        rover.setZone(zone);
        rover.processCommands("M");

        assertEquals("1 2 N", rover.getPositionAndDirection());
    }

    @Test
    void canMoveEast(){

        Zone zone = new Zone(6, 6);

        Rover rover = new Rover(1, 1, Direction.EAST);
        rover.setZone(zone);
        rover.processCommands("M");

        assertEquals("2 1 E", rover.getPositionAndDirection());
    }

    @Test
    void canMoveWest(){

        Zone zone = new Zone(6, 6);

        Rover rover = new Rover(1, 1, Direction.WEST);
        rover.setZone(zone);
        rover.processCommands("M");

        assertEquals("0 1 W", rover.getPositionAndDirection());
    }

    @Test
    void canRunMultipleCommands(){

        Zone zone = new Zone(8, 8);

        Rover rover = new Rover(1, 1, Direction.EAST);
        rover.setZone(zone);
        rover.processCommands("MLMR");

        assertEquals("2 2 E", rover.getPositionAndDirection());
    }
}
