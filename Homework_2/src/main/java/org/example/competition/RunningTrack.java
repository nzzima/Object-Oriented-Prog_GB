package org.example.competition;

public class RunningTrack extends Obstacle{
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
