package JavaHomeWork.S3.ex4;

import java.util.Arrays;
import java.util.List;

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
        return "Students [name=" + name + ", number=" + number + ", salary=" + salary + ", balls=" + balls + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + number;
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((balls == null) ? 0 : balls.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Students other = (Students) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (number != other.number)
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        if (balls == null) {
            if (other.balls != null)
                return false;
        } else if (!balls.equals(other.balls))
            return false;
        return true;
    }

   

}
