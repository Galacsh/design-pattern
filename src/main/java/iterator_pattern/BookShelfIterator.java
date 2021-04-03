package iterator_pattern;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this(bookShelf, 0);
    }

    public BookShelfIterator(BookShelf bookShelf, int startIndex) {
        this.bookShelf = bookShelf;
        this.index = startIndex;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
