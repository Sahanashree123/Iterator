package Iterator;
import java.util.ArrayList;
import java.util.List;

public class BookCollectionImpl implements BookCollection {
    private List<Book> books;

    public BookCollectionImpl() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }

    private class BookIterator implements Iterator<Book> {
        private int index;
        private List<Book> books;

        public BookIterator(List<Book> books) {
            this.books = books;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            if (hasNext()) {
                return books.get(index++);
            }
            return null;
        }
    }
}