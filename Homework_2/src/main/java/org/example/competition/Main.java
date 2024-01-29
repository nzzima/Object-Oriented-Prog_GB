package org.example.competition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        List<Participant> participantList = new ArrayList<>(Arrays.asList(human, cat, robot));
        List<Obstacle> obstacles = new ArrayList<>(Arrays.asList(new RunningTrack(200), new Wall(1.0),
                                                                new RunningTrack(250), new Wall(1.2),
                                                                new RunningTrack(300), new Wall(1.4)));

        for (Participant participant : participantList) {
            boolean check = true;
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof RunningTrack) {
                    check = participant.run(((RunningTrack) obstacle).getLength());
                    if (!check) {
                        break;
                    } else continue;
                } else if (obstacle instanceof Wall) {
                    check = participant.jump(((Wall) obstacle).getHeight());
                    if (!check) {
                        break;
                    } else continue;
                }
            }
            if (check)
                System.out.println(participant + " успешно преодолел все препятствия\n");
        }
    }
}
