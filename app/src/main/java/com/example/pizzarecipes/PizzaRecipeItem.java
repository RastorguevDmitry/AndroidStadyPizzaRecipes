package com.example.pizzarecipes;

public class PizzaRecipeItem {

    private int imageResurse;
    private String title;
    private String description;
    private String recipe;


    public int getImageResurse() {
        return imageResurse;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }

    public PizzaRecipeItem(int imageResurse, String title, String description, String recipe) {
        this.imageResurse = imageResurse;
        this.title = title;
        this.description = description;
        this.recipe = recipe;

    }
}
