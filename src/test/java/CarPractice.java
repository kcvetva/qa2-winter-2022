import org.junit.jupiter.api.Test;

public class CarPractice {
    @Test
    public void workingWithCar() {
        Car firstCar = new Car();
        firstCar.setMakeOfTheCar("Honda");
        firstCar.setColor("blue");
        firstCar.setProductionYear(2008);

        Car secondCar = new Car();
        secondCar.setMakeOfTheCar("Lexus");
        secondCar.setColor("Black");
        secondCar.setProductionYear(2007);

        System.out.println(firstCar.getMakeOfTheCar());
        System.out.println(firstCar.getColor());
        System.out.println(firstCar.getProductionYear());

        System.out.println(secondCar.getMakeOfTheCar());
        System.out.println(secondCar.getColor());
        System.out.println(secondCar.getProductionYear());
    }


}
