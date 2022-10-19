import org.junit.jupiter.api.Test;

public class BurgerPractice {
    @Test
    public void workingWithBurger() {
    burger firstBurger = new burger();
    firstBurger.setVegan(true);
    firstBurger.setCalories(478);
    firstBurger.setPrice((float)7.99);

    burger secondBurger = new burger();
    secondBurger.setVegan(false);
    secondBurger.setCalories(533);
    secondBurger.setPrice((float)7.49);

    System.out.println("firstBurger");
    System.out.println(firstBurger.isVegan());
    System.out.println(firstBurger.getCalories());
    System.out.println(firstBurger.getPrice());

    System.out.println("secondBurger");
    System.out.println(secondBurger.isVegan());
    System.out.println(secondBurger.getCalories());
    System.out.println(secondBurger.getPrice());

    }


}
