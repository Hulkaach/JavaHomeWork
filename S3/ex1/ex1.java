package JavaHomeWork.S3.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {

    /**
     * Даны сведения об экспортируемых товарах: указывается наименование товара,
     * страна, экспортирующая товар, и объем поставляемой партии в штуках.
     * Найти страны, которые экспортируют данный(введенный с кл-ы) товар, и общий
     * объем его экспорта.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Product pr = new Product("qwe", "China", 3);
        Product pr2 = new Product("qwe2", "China", 4);
        Product pr3 = new Product("qwe3", "Russia", 2);

        List<Product> productList = new ArrayList<>();
        productList.add(pr);
        productList.add(pr2);
        productList.add(pr3);
        System.out.println(productList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название: ");
        String nameSearchName = scanner.nextLine();
        Integer exporVolume = 0;
        List<String> countryList = new ArrayList<>();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name.equals(nameSearchName)) {
                exporVolume += productList.get(i).volume;
                if (!countryList.contains(productList.get(i).country)){
                    countryList.add(productList.get(i).country);
                    
                }                

            }
        }
        
        System.out.println(countryList);
        System.out.println(exporVolume);

    }

}
