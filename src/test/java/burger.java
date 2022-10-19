public class burger {
    //--------------ATTRIBUTES----------
    private float price;
    private boolean isVegan; //regular or vegan
    private String name;
    private int calories;
    private String typeOfBread;

    //-----------GETTERS/SETTERS--------

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getTypeOfBread() {
        return typeOfBread;
    }

    public void setTypeOfBread(String typeOfBread) {
        this.typeOfBread = typeOfBread;
    }
}
