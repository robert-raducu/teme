package Tema1617;

//-Design a recipe book where you can add recipes, and search for recipes based on ingredients.
//class Recipe {
//    private String name;
//    private List<String> ingredients;
//}
//
//-Adaugati in clasa: constructor, getteri, setteri, metoda addRecipe(), metoda public boolean hasIngredient(String ingredient).
//
//-In clasa Main folositi acest array pentru a apela metoda hasIngredient() de mai sus:
//List<Recipe> recipesWithMilk = new ArrayList<>();

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a list of ingredients for the recipe
        List<String> ingredients = new ArrayList<>();
        ingredients.add("lapte");
        ingredients.add("cereale");
        // Add more ingredients as needed

        // Create a Recipe object
        Recipe recipe1 = new Recipe("Lapte cu Cereale", ingredients);

        System.out.println("Recipe Name: " + recipe1.getName());
        System.out.println("Ingredients: " + recipe1.getIngredients());

        //Add in recipes with Milk
        List<Recipe> recipesWithMilk = new ArrayList<>();
        recipesWithMilk.add(recipe1);

        for (Recipe recipe : recipesWithMilk) {
            System.out.println(recipe.getName());
        }

        //Check if it is has the ingredient 'lapte'
        System.out.println("Exista lapte in lapte cu cereale? " + recipe1.hasIngredient("LaPTe"));

    }
}
