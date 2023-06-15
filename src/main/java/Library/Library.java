import java.util.ArrayList;

class Book{
    public String name, author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book { '" + "name = " + name + '\'' + ", author='" + author + '\'' + '}';
    }
}

class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }

}


