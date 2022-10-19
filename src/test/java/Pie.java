public class Pie {
    //--------------ATTRIBUTES----------
    private float price;
    private String taste;
    private boolean isPortionBig; //big or small
    private boolean isSweet; //sweet or salty
    private int quantity;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public boolean isPortionBig() {
        return isPortionBig;
    }

    public void setPortionBig(boolean portionBig) {
        isPortionBig = portionBig;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
