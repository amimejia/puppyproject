package edu.guilford;
import java.util.Random;

public class dogfood {
    //attributes
    private boolean dry;
    private boolean generic;
    private int nutritionrating;
    private double averageprice;

    //constructor
public dogfood() {
    Random rand = new Random();
    dry = rand.nextBoolean();
    generic = rand.nextBoolean();
    nutritionrating = rand.nextInt(5) + 1;
    averageprice = rand.nextDouble(20.99) + 1;
}
    public dogfood(boolean dry, boolean generic, int nutritionrating, double averageprice) {
        this.dry = dry;
        this.generic = generic;
        this.nutritionrating = nutritionrating;
        this.averageprice = averageprice;
    }
    
    //getters
    public boolean isDry() {
        return dry;
    }
    public boolean isGeneric() {
        return generic;
    }
    public int getNutritionrating() {
        return nutritionrating;
    }
    public double getAverageprice() {
        return averageprice;
    }
    
}
