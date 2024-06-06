package Iterator;
public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollectionImpl();
        bookCollection.addBook(new Book("Design Patterns"));
        bookCollection.addBook(new Book("Effective Java"));
        bookCollection.addBook(new Book("Clean Code"));

        Iterator<Book> iterator = bookCollection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Reading book: " + book.getTitle());
        }
    }
}