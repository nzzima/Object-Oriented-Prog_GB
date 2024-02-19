package org.example.jobagency;

public class Junior implements Observer{
    private String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        System.out.println(name + " принимается за работу в компанию " + nameCompany);
    }
}
