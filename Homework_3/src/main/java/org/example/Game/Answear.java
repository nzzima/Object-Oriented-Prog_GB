package org.example.Game;

public class Answear {
    private int cowCounter;
    private int bullCounter;
    private int tryCount;

    public Answear(int cowCounter, int bullCounter, int tryCount) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
    }

    @Override
    public String toString() {
        return cowCounter + " коровы " + bullCounter + " быка, осталось попыток : " + tryCount;
    }

    public int getCowCounter() {
        return cowCounter;
    }

    public void setCowCounter(int cowCounter) {
        this.cowCounter = cowCounter;
    }

    public int getBullCounter() {
        return bullCounter;
    }

    public void setBullCounter(int bullCounter) {
        this.bullCounter = bullCounter;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }
}
