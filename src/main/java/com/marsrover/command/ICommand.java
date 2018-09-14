package com.marsrover.command;

import com.marsrover.Rover;

public interface ICommand {
    void executeCommand(Rover rover);
}
