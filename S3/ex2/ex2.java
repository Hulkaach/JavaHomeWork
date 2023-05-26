package JavaHomeWork.S3.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ex2 {
    /**
     * Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам. 
     * Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
     * @param args
     */
    public static void main(String[] args) {
        List<Students> students = GetStudents();
        for (Students student : students) {
            if (student.name.endsWith("ова")){
                int sum = 0;
                for (Integer ball : student.balls) {
                    sum +=ball;
                    
                }
                if (sum % 2 == 0){
                    System.out.println(student.salary);
                }
            }             
        }                 
    }

    public static Collection uniqeList(List<Students> students) {
        return new HashSet(students);
    }

    public static List<Students>  GetStudents() {
        List<Students> students = new ArrayList<Students>();    
        students.add(new Students("Айова", 1, 12.3, Arrays.asList(10,40,30)));
        students.add(new Students("Аврова", 2, 11.3, Arrays.asList(10,21,30)));
        students.add(new Students("Тула", 3, 13.3, Arrays.asList(12,20,30)));
        students.add(new Students("Енре", 4, 14.3, Arrays.asList(10,20,33)));
        students.add(new Students("Акеы", 5, 16.3, Arrays.asList(10,20,30)));
         
        return students;
    }    
}
