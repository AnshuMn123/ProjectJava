import java.util.ArrayList;
public class Author {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<Book>();
        Book b1 = new Book("A1", "1");
        bk.add(b1);

        Book b2 = new Book("A2", "2");
        bk.add(b2);

        Book b3 = new Book("A3", "3");
        bk.add(b3);


        Book b4 = new Book("A1", "4");
        bk.add(b4);

        Library l = new Library(bk);
        l.addBook(new Book("A5", "5"));
        System.out.println(l.books);

        l.issueBook(b3, "An");
        System.out.println(l.books);
    }
}