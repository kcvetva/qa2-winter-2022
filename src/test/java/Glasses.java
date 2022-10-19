public class Glasses {
    //--------------ATTRIBUTES----------
    private double dioptry;
    private String material;
    private String color;
    private float price;
    private boolean gender;

    public double getDioptry() {
        return dioptry;
    }

    public void setDioptry(double dioptry) {
        this.dioptry = dioptry;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
