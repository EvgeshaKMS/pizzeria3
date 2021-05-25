package pizzamodel;

public class Pizza extends Goods {
    private double weight;
    private int diameter;
    private String ingredients;

    public Pizza(String name, double calories, double protein, double fat, double carbohydrates, int cost, int quantity, double weight, int diameter, String ingredients) {
        super(name, calories, protein, fat, carbohydrates, cost, quantity);
        this.weight = weight;
        this.diameter = diameter;
        this.ingredients = ingredients;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
