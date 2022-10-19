import org.junit.jupiter.api.Test;

public class GlassesPractice {
    @Test
    public void workingWithGlasses() {
        Glasses firstGlasses = new Glasses();
        firstGlasses.setDioptry(1.5);
        firstGlasses.setColor("Black");

        Glasses secondGlasses = new Glasses();
        secondGlasses.setDioptry(+2);
        secondGlasses.setColor("pink");

        System.out.println(firstGlasses.getDioptry());
        System.out.println(firstGlasses.getColor());

        System.out.println(secondGlasses.getDioptry());
        System.out.println(secondGlasses.getColor());
    }

}
