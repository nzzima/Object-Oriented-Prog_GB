package org.example.service;

import java.io.FileWriter;
import java.io.IOException;

public class ConsoleLogger implements Logable{
    @Override
    public void log(String message) {
        String logmsg = "LOG: " + message;
        System.out.println(logmsg);
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(logmsg);
            writer.append('\n');
            writer.flush();
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
