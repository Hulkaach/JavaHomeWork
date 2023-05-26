package JavaHomeWork.S3.ex3;

/**
 * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых
 * сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический,
 * картонный и тд.).
 * Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 * 
 * @param args
 */

public class Cube {
    float length;
    String color;
    String material;

    public Cube(float length, String color, String material) {
        this.length = length;
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cube [length=" + length + ", color=" + color + ", material=" + material + "]";
    }

    public float VolumeCube() {
        return (length * length * length);
    }
}
