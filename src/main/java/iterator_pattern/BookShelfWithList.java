package iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelfWithList {

    private final List<Book> books;
    private int last = 0;

    public BookShelfWithList() {
        books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
