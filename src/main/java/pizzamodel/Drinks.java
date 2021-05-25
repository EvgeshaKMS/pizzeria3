package pizzamodel;

public class Drinks extends Goods{
    private int volume;

    public Drinks(String name, double calories, double protein, double fat, double carbohydrates, int cost, int quantity, int volume) {
        super(name, calories, protein, fat, carbohydrates, cost, quantity);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
