import java.util.ArrayList;
import java.util.List;

public class Product {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Coca-cola";
        product1.Cost = 12.0;
        Product product2 = new Product();
        product2.name = "Chips";
        product2.Cost = 62.0;
        Product product3 = new Product();
        product3.name = "Pepsi";
        product3.Cost = 53.0;
        ProductMachine productMachine = new ProductMachine();
        ArrayList<Product> arrayList = new ArrayList<Product>(List.of(product1, product2, product3));
        productMachine.initProducts(arrayList);
        System.out.println(productMachine.GetProduct("Coca-cola"));
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Cost=" + Cost +
                '}';
    }

    String name;
    Double Cost;
}
