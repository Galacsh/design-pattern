package iterator_pattern;

public class BookShelf implements Aggregate {

    private final Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last ++] = book;
    }

    public int getLength() {
        return this.last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
