package produktList;

import java.util.Set;

public class RecipeList {
    private Set <Recipe> recipes;

    public RecipeList(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void add(Recipe recipe){
        if(recipes.contains(recipe)){
            throw new IllegalArgumentException("Такой рецепт уже есть!");
        }
        recipes.add(recipe);
    }
    public void remove(Recipe recipe){
        if(!recipes.remove(recipe)){
            throw new IllegalArgumentException("Такого рецепта нет!");
        }
        recipes.remove(recipe);
    }
}
