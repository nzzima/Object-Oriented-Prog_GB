package org.example.cords;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector() {
        x = 0;
        y = 0;
        z = 0;
    }
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                '}';
    }

    /**
     * @apiNote Метод, вычисляющий длину вектора
     * @return Длина вектора
     */
    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     * @apiNote Метод, вычисляющий скалярное произведение
     * @param vectOTwo Второй вектор, с которым происходит умножение
     * @return Скалярное произведение
     */
    public double scalarProduct(Vector vectOTwo) {
        return (x * vectOTwo.getX() + y * vectOTwo.getY() + z * vectOTwo.getZ());
    }

    /**
     * Метод, вычисляющий векторное произведение
     * @param vectTwo Вектор, с которым происходит произведение
     * @return Результат
     */
    public Vector vectMultiply(Vector vectTwo) {
        return new Vector(
                y * vectTwo.z - z * vectTwo.y,
                z * vectTwo.x - x * vectTwo.z,
                x * vectTwo.y - y * vectTwo.x
        );
    }

    /**
     * Метод, вычисляющий косинус угла между векторами
     * @param vectTwo Второй вектор, с которым вычисляется косинус
     * @return Результат
     */
    public double cos(Vector vectTwo) {
        return scalarProduct(vectTwo) / length() * vectTwo.length();
    }
}
