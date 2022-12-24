package produktList;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    private Map<Product, Integer> products = new HashMap<>();

    public ProductList(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void add(Product product, int amount){
        if(products.containsKey(product)){
            throw new IllegalArgumentException("Такой продукт уже есть!");
        }
        products.put(product, amount);
    }

    public void add(Product product){
        add(product, 1);
    }

    /*public void remove(Product product){
        if(!products.remove(product)){
            throw new IllegalArgumentException("Такого продукта нет!");
        }
        products.remove(product);
    }*/

    @Override
    public String toString() {
        return products.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
