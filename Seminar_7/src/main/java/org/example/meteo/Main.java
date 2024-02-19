package org.example.meteo;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        ST500Info st500 = new ST500Info();
        Adapter adapter = new Adapter(st500.getData());
        meteoDb.save(adapter);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить
        // в метод save объекта meteoDb
    }
}