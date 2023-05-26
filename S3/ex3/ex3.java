package JavaHomeWork.S3.ex3;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    /**
     * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), 
     * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). 
     * Найти:
     * - количество кубиков желтого цвета и их суммарный объем;
     * - количество деревянных кубиков с ребром 3 см
     * @param args
     */
    public static void main(String[] args) {
        List<Cube> cubes = getCubes();
        int amountYellow = 0;
        float volumeYellow = 0;
        int amountWood = 0;
        
        for (Cube cube : cubes) {
            if(cube.color.equals("yellow")){
                amountYellow ++;
                volumeYellow += cube.VolumeCube();
            }
            if (cube.material.equals("wood")){
                amountWood ++;
            }
        }
        System.out.println(amountWood);
        System.out.println(amountYellow);
        System.out.println(volumeYellow);
    }

    public static ArrayList<Cube> getCubes() {
        ArrayList<Cube> cubes = new ArrayList<Cube>();
        cubes.add(new Cube(2, "red", "wood"));
        cubes.add(new Cube(3, "green", "wood"));
        cubes.add(new Cube(4, "yellow", "wood"));
        cubes.add(new Cube(4, "black", "steel"));
        return cubes;
    }
}
