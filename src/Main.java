import jdk.jshell.spi.SPIResolutionException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Product product = new Product("Apple","Apple from Yssyk Kol",new BigDecimal(100), LocalDate.of(2023,2,2),
                TypeProduct.VEGETABLES);
        Product product1 = new Product("Green bean","Green bean from Talas",new BigDecimal(130),LocalDate.of(2023,2,18),
                TypeProduct.VEGETABLES);
        Product product2 = new Product("Hoodie","White hoodie",new BigDecimal(3600),LocalDate.of(2022,11,6),
                TypeProduct.CLOTHES);
        Product product3 = new Product("Hat","Green hat cowboy",new BigDecimal(2400),LocalDate.of(2022,12,23),
                TypeProduct.CLOTHES);
        Product product4 = new Product("Phone","iPhone",new BigDecimal(150000),LocalDate.of(2022,9,7),
                TypeProduct.ELECTRONIC);
        Product product5 = new Product("Laptop","Laptop made Acer",new BigDecimal(90000),LocalDate.of(2021,8,6),
                TypeProduct.ELECTRONIC);

        Product [] products = {product,product1,product2,product3,product4,product5};
        Inventory inventory = new Inventory(products);


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                \n
                1: Search name
                2: Search type
                """);
            int a = new Scanner(System.in).nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println("Enter a request");
                    String enterARequest = new Scanner(System.in).nextLine().toUpperCase();
                    inventory.searchProductName(enterARequest);

                }
                case 2 -> {
                    System.out.println("Enter a request");
                    String enterARequest = new Scanner(System.in).nextLine().toUpperCase();
                    inventory.searchProductType(enterARequest);

                }
            }
        }



    }
}