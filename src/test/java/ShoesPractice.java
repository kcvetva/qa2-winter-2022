import org.junit.jupiter.api.Test;

public class ShoesPractice {
    @Test
    public void workingWithShoes() {
        Shoes firstPair = new Shoes();
        firstPair.setSize(36);
        firstPair.setType("High heels");

        Shoes secondPair = new Shoes();
        secondPair.setSize(43);
        secondPair.setType("Sneakers");

        System.out.println(firstPair.getSize());
        System.out.println(firstPair.getType());

        System.out.println(secondPair.getSize());
        System.out.println(secondPair.getType());
    }
}
