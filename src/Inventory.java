import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Inventory implements Checkable {

    private Product[] products;


    public Inventory(Product[] products) {
        this.products = products;
    }

    public Inventory() {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public void searchProductType(String searchType) {

        switch (searchType.toUpperCase()) {
            case "VEGETABLES" -> {
                for (int i = 0; i < products.length; i++) {
                    if (products[i].getTypeProductString().equals("VEGETABLES")) {
                        int a = Period.between(products[i].getMadeOfDate(), LocalDate.now()).getDays();
                        if (a >= 10) {
                            System.out.println("Expired goods!\n" + products[i].toString());
                        }
                        if (a < 9) {
                            System.out.println(products[i].toString());
                        }
                    }
                }
            }
            case "ELECTRONIC" -> {
                for (int i = 0; i < products.length; i++) {
                    if (products[i].getTypeProductString().equals("ELECTRONIC")) {
                        int a = Period.between(products[i].getMadeOfDate(), LocalDate.now()).getYears();
                        if (a >= 6) {
                            System.out.println("Expired goods!\n" + products[i].toString());
                        }
                        if (a < 5) {
                            System.out.println(products[i].toString());
                        }
                    }
                }
            }
            case "CLOTHES" -> {
                for (int i = 0; i < products.length; i++) {
                    if (products[i].getTypeProductString().equals("CLOTHES")) {
                        System.out.println(products[i].toString());
                    }
                }
            }
        }
    }


    @Override
    public void searchProductName(String searchName) {
        
    }


    @Override
    public String checkingTheDate() {
        return null;
    }

    @Override
    public String checkingTheDateElectronic() {
        return null;
    }
}





