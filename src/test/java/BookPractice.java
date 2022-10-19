import org.junit.jupiter.api.Test;

public class BookPractice {
    @Test
    public void workingWithBook() {
        Book firstBook = new Book(); // создали пустой обьект класса Book (в нем сейчас ничего нету)
        firstBook.setName("Harry Potter");
        firstBook.setAuthor("J.K. Rowling");
        firstBook.setPrice((float)20.99);

        Book secondBook = new Book();
        secondBook.setName("You are a badass");
        secondBook.setAuthor("Jen Sincero");
        secondBook.setPrice((float)9.99);

        // print - продолжить выводить в консоль с той же строки
        // println - начать выводить в консоль с новой строки

        //выведем в консоль все для первой книги (Book firstBook = new Book())
        System.out.println(firstBook.getName());
        System.out.println(firstBook.getPrice());

        //выведем в консоль все для второй книги (Book secondBook = new Book())
        System.out.println(secondBook.getName());
        System.out.println(secondBook.getPrice());
    }
}
