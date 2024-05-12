package Tema16_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//-Adaugati in clasa: constructor, getteri, setteri, metoda addRecipe(),
// metoda public boolean hasIngredient(String ingredient).
public class Recipe {
    private String name;
    private List<String> ingredients;

    ArrayList<Recipe> recipes = new ArrayList<>();

    /**
     * adaugare reteta
     **/
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    /**
     * are sau nu ingredient
     **/
    public boolean hasIngredient(String ingredient) {

        ingredient = ingredient.toLowerCase();
        for (String ing : ingredients) {
            if (Objects.equals(ingredient, ing)) {
                return true;
            }
        }
        return false;
    }

    /**
     * stergere reteta
     **/
    public void removeRecipe(String name) {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getName().equals(name)) {
                recipes.remove(i);
                break;
            }
        }
    }

    /**
     * cautare reteta
     **/
    public Recipe search(String recipeName) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equals(recipeName)) {
                return recipe; // Return the found recipe
            }
        }
        return null; // Recipe not found
    }

    public Recipe(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
