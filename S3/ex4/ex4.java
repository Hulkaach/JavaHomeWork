package JavaHomeWork.S3.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex4 {
    /**
     * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
     * @param args
     */
    public static void main(String[] args) {
        List<Students> students = GetStudents();
        System.out.println("Уникальный список: " + uniqeList(students)); 
    }
    
    public static List<Students>  GetStudents() {
        List<Students> students = new ArrayList<Students>();    
        students.add(new Students("Айова", 1, 12.3, Arrays.asList(10,40,30)));
        students.add(new Students("Аврова", 2, 11.3, Arrays.asList(10,21,30)));
        students.add(new Students("Аврова", 2, 11.3, Arrays.asList(10,21,30)));
        students.add(new Students("Аврова", 2, 11.3, Arrays.asList(10,21,30)));
        students.add(new Students("Аврова", 2, 11.3, Arrays.asList(10,21,30)));
        students.add(new Students("Тула", 3, 13.3, Arrays.asList(12,20,30)));
        students.add(new Students("Енре", 4, 14.3, Arrays.asList(10,20,33)));
        students.add(new Students("Акеы", 5, 16.3, Arrays.asList(10,20,30)));
         
        return students;
    } 

    public static Collection uniqeList(List<Students> students) {
        return new HashSet(students);        
    }
    
}
