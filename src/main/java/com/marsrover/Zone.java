package com.marsrover;


public class Zone {

    private int lowerBoundX = 0;
    private int lowerBoundY = 0;

    private int upperBoundX = 0;
    private int upperBoundY = 0;

    public Zone(int upperBoundX, int upperBoundY) {

        this.upperBoundX = upperBoundX;
        this.upperBoundY = upperBoundY;

    }

    public int getLowerBoundX() {
        return lowerBoundX;
    }

    public void setLowerBoundX(int lowerBoundX) {
        this.lowerBoundX = lowerBoundX;
    }

    public int getLowerBoundY() {
        return lowerBoundY;
    }

    public void setLowerBoundY(int lowerBoundY) {
        this.lowerBoundY = lowerBoundY;
    }

    public int getUpperBoundX() {
        return upperBoundX;
    }

    public void setUpperBoundX(int upperBoundX) {
        this.upperBoundX = upperBoundX;
    }

    public int getUpperBoundY() {
        return upperBoundY;
    }

    public void setUpperBoundY(int upperBoundY) {
        this.upperBoundY = upperBoundY;
    }
}