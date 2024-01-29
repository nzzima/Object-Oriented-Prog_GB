package org.example.competition;

public class Cat implements Participant {

    private final int MAX_RUN_DIST = 300;
    private final double MAX_JUMP_HEIGHT = 1.0;

    public Cat() {}

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println("Кот пробежал дистанцию в " + distance + " метров");
            return true;
        } else {
            System.out.println("Кот не смог пробежать дистанцию в " + distance + " метров\n");
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (height <= MAX_JUMP_HEIGHT) {
            System.out.println("Кот перепрыгнул препятсвие высотой " + height + " метров");
            return true;
        } else {
            System.out.println("Кот не смог перепрыгнуть препятсвие высотой " + height + " метров\n");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Кот";
    }
}
