package chapter11;

public class Customer {

    public static void main(String[] args) {

        Product book = new Book();

        book.setColor("Black");
        book.setName("Gulliver");
        book.setPrice(1234.78);

        System.out.println(book.getColor());

    }
}
