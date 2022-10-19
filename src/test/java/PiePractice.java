import org.junit.jupiter.api.Test;

public class PiePractice {
    @Test
    public void workingWithPie() {
        Pie firstPie = new Pie();
        firstPie.setTaste("With meat");
        firstPie.setQuantity(2);

        Pie secondPie = new Pie();
        secondPie.setTaste("Vanilla");
        secondPie.setQuantity(5);

        System.out.println(firstPie.getTaste());
        System.out.println(firstPie.getQuantity());

        System.out.println(secondPie.getTaste());
        System.out.println(secondPie.getQuantity());
    }
}
