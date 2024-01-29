package org.example.competition;

public class Human implements Participant {

    private final int MAX_RUN_DIST = 500;
    private final double MAX_JUMP_HEIGHT = 1.5;

    public Human() {}

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println("Человек пробежал дистанцию в " + distance + " метров");
            return true;
        } else {
            System.out.println("Человек не смог пробежать дистанцию в " +distance + " метров\n");
            return false;
        }
    }

    @Override
    public boolean jump(double heigth) {
        if (heigth <= MAX_JUMP_HEIGHT) {
            System.out.println("Человек перепрыгнул препятсвие высотой " + heigth + " метров");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть препятсвие высотой " + heigth + " метров\n");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Человек";
    }
}
