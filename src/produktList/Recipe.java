package produktList;

import java.util.*;

public class  Recipe {
    private String name;
    private final Map<Product, Integer> products;
    private double totalCost;

    public Recipe(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
        this.products = new HashMap<>();
        this.totalCost = 0;
    }

    public void add(Product product){
        products.put(product, 1);
        totalCost +=product.getPrice();
    }

    public void add(Product product, int amount){
        products.put(product, amount);
        totalCost += amount * product.getPrice();
    }

    public String getName() {

        return name;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
    }

    public void setTotalCost(double totalCost) {

        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Руцепт " + name + '\n' +
                "Список продуктов: " + products + '\n' +
                "Стоимость: " + totalCost;
    }
}
