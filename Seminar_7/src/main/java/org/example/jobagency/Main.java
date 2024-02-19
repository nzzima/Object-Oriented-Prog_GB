package org.example.jobagency;

public class Main {

    // Добавить нового наблюдателя, например Specialist, который будет наблюдать за Company
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Publisher jobAgency2 = new JobAgency();

        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        Company yandex = new Company(jobAgency2, "Yandex", 150);

        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("Sidorov");

        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency2.registerObserver(sidorov);

        for(int i = 0; i< 2; i++){
            google.needEmpoyee();
            geekBrains.needEmpoyee();
            yandex.needEmpoyee();
        }
    }
}
