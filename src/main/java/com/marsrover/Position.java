package com.marsrover;

public class Position {

    private int x;
    private int y;
    private char direction;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void shiftPosition(char dir) {

        switch (dir) {

            case 'S':
                this.decreaseY();
                break;
            case 'E':
                this.increaseX();
                break;
            case 'N':
                this.increaseY();
                break;
            case 'W':
                this.decreaseX();
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void decreaseY() {
        this.y--;
    }

    public void increaseY() {
        this.y++;
    }

    public void increaseX() {
        this.x++;
    }

    public void decreaseX() {
        this.x--;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
