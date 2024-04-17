package test.java.sessions.fabiolaMonrroy.katas.example23;

import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int maxCakes = Integer.MAX_VALUE;
        for (String ingredient : recipe.keySet()) {
            if (!available.containsKey(ingredient)) {
                return 0; // Missing ingredient, cannot bake any cakes
            }
            int recipeAmount = recipe.get(ingredient);
            int availableAmount = available.get(ingredient);
            int cakesFromIngredient = availableAmount / recipeAmount;
            maxCakes = Math.min(maxCakes, cakesFromIngredient);
        }
        return maxCakes;
    }
}
