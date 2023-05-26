package JavaHomeWork.S3.ex1;

public class Product {
    String name;
    String country;
    Integer volume;

    public Product(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", country=" + country + ", volume=" + volume + "]";
    }

    // public String getName() {
    // return name;
    // }
    // public Integer getVolume() {
    // return volume;
    // }
    // public String getCountry() {
    // return country;
    // }

}
