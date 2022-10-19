import org.junit.jupiter.api.Test;

public class RingPractice {
    @Test
    public void workingWithRing() {
        Ring firstRing = new Ring();
        firstRing.setColor("Gold");
        firstRing.setPrice((float)593.89);

        Ring secondRing = new Ring();
        secondRing.setColor("Silver");
        secondRing.setPrice((float)345.74);

        System.out.println(firstRing.getColor());
        System.out.println(firstRing.getPrice());

        System.out.println(secondRing.getColor());
        System.out.println(secondRing.getPrice());
    }
}
