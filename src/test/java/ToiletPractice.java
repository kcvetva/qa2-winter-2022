import org.junit.jupiter.api.Test;

public class ToiletPractice {
    @Test
    public void workingWithToilet() {
        Toilet mainToilet = new Toilet();
        mainToilet.setVolumeOfTheFlushTank(6); //liters
        mainToilet.setColor("Black");

        Toilet guestToilet = new Toilet();
        guestToilet.setVolumeOfTheFlushTank(4);
        guestToilet.setColor("White");

        System.out.println(mainToilet.getVolumeOfTheFlushTank());
        System.out.println(mainToilet.getColor());

        System.out.println(guestToilet.getVolumeOfTheFlushTank());
        System.out.println(guestToilet.getColor());
    }
}
