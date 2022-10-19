public class Ring {
    //--------------ATTRIBUTES----------
    private float size;
    private String color;
    private boolean isGold; //gold or silver
    private float price;
    private int amount;

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isGold() {
        return isGold;
    }

    public void setGold(boolean gold) {
        isGold = gold;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
