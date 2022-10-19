import org.junit.jupiter.api.Test;

public class HusbandPractice {
    @Test
    public void workingWithHusband() {
        Husband firstHusband = new Husband();
        firstHusband.setAge(39);
        firstHusband.setJobRole("developer");

        Husband secondHusband = new Husband();
        secondHusband.setAge(27);
        secondHusband.setJobRole("cleaner");

        System.out.println(firstHusband.getAge());
        System.out.println(firstHusband.getJobRole());

        System.out.println(secondHusband.getAge());
        System.out.println(secondHusband.getJobRole());


    }
}
