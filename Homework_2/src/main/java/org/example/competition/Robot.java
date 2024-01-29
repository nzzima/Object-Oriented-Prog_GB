package org.example.competition;

public class Robot implements Participant {

    private final int MAX_RUN_DIST = 200;
    private final double MAX_JUMP_HEIGHT = 0.2;

    public Robot() {}

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println("Робот пробежал дистанцию в " + distance + " метров");
            return true;
        } else {
            System.out.println("Робот не смог пробежать дистанцию в " + distance + " метров\n");
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (height <= MAX_JUMP_HEIGHT) {
            System.out.println("Робот перепрыгнул препятсвие высотой " + height + " метров");
            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть препятсвие высотой " + height + " метров\n");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Робот";
    }
}
