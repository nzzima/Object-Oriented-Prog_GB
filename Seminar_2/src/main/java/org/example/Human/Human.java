package org.example.Human;

public class Human {

    private Transport lastTransport;
    public void drive(Transport transport) {
        if (lastTransport != null) {
            System.out.println("Пользователь уже едет");
        } else {
            lastTransport = transport;
            lastTransport.run();
        }
    }

    public void stop(Transport transport) {
        if (lastTransport != null) {
            transport.stop();
            lastTransport = null;
        } else {
            System.out.println("Уже стоим!");
        }
    }
}
