# MarsRover-2

In this challange I tried to showcase my understanding of design patterns and object oriented programming by solving the given challange 
using Factory Design Pattern. The factory design pattern in this solution is used to construct commands for the Rover. This makes my code 
cleaner and readable because I do not have to always check command type before execution, command types are checked as soon as they are read
from the input and then the appropriate method call is made when such command is executed.

The Rover is not allowed to move in restricted areas, therefore the code will return error message if the rover is not within the allowed area.
However, the rover can be positioned in any place on the map or zone but it will be stuck there. 

## Correctness Testing
I implemented JUnit 5 as testing framework to ensure the correctness of written code

## Input File 
The input file should be of the following format <br/>
8 10 <br/>
3 3 E <br/>
MMRMMRMRRM <br/>

Where the first line indicates the size of a map, second line indicate the coordinates where the Rover starts, and the third line is a list of commands to be executed by the Rover 

# How To Run This Program
## Requirements
- Java 8
- Maven v3.3

## Program Compilation
- mvn install
- sh compile.sh
- sh run.sh [input-file-name]
