import java.util.ArrayList;

public class ProductMachine {

    ArrayList<Product> array = new ArrayList<Product>();

    public void initProducts(ArrayList arrayProduct) {
        array = arrayProduct;
    }

    public Product GetProduct(String name) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i).name.equals(name)) {
                return array.get(i);
            }
        }
        return null;
    }
}
