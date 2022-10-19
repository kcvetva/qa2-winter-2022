public class Toilet {
    //--------------ATTRIBUTES----------
    private String color;
    private float price;
    private float volumeOfTheFlushTank;
    private boolean isOnTheFloor; //position on the floor or on the wall
    private String name;

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

    public float getVolumeOfTheFlushTank() {
        return volumeOfTheFlushTank;
    }

    public void setVolumeOfTheFlushTank(float volumeOfTheFlushTank) {
        this.volumeOfTheFlushTank = volumeOfTheFlushTank;
    }

    public boolean isOnTheFloor() {
        return isOnTheFloor;
    }

    public void setOnTheFloor(boolean onTheFloor) {
        isOnTheFloor = onTheFloor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
