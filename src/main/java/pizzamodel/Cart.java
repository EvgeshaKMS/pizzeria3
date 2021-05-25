package pizzamodel;


public class Cart {
    private Goods[] goods;
    private boolean isLessThanFive;
    private boolean isLessThanFour;
    private int totalCost;

    public Goods[] getGoods() {
        return goods;
    }
    public void addGoods(Goods[] goods){
        this.goods = getGoods();
    }
    public boolean isLessThanFivePizzas(){
        return isLessThanFive;
    }
    public boolean isLessThanFourDrinks(){
        return isLessThanFour;
    }
    public int getTotalCost(){
        return totalCost;
    }
}
