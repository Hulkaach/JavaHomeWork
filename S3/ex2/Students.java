package JavaHomeWork.S3.ex2;

import java.util.Arrays;
import java.util.List;

/**
     * Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам. 
     * Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
     * @param args
     */
public class Students {
    String name;
    int number;
    double salary;
    List<Integer> balls;
   
   
    public Students(String name, int number, double salary, List<Integer> balls) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.balls = balls;
    }





    @Override
    public String toString() {
        return "Students [name=" + name + ", number=" + number + ", salary=" + salary + ", balls="
                + Arrays.toString(balls) + "]";
    }

    
    
    
}
