import org.junit.jupiter.api.Test;

public class CatPractice {
    @Test
    public void workingWithCat() {
     Cat firstCat = new Cat();
     firstCat.setBreed("Exotic Shorthair");
     firstCat.setAge(3);
     firstCat.setPrice(320.09);

     Cat secondCat = new Cat();
     secondCat.setBreed("Scottish Straight");
     secondCat.setAge(1);
     secondCat.setPrice(250.47);

     System.out.println(firstCat.getBreed());
     System.out.println(firstCat.getAge());
     System.out.println(firstCat.getPrice());

     System.out.println(secondCat.getBreed());
     System.out.println(secondCat.getAge());
     System.out.println(secondCat.getPrice());


     }

}
