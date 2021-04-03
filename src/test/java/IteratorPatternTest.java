import iterator_pattern.Book;
import iterator_pattern.BookShelf;
import iterator_pattern.BookShelfWithList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class IteratorPatternTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        String className = testInfo.getTestClass().orElseThrow().getSimpleName();
        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("============= Test [" + className + " - " + methodName + "] =============");
    }

    @Test
    public void arrayType() {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("hello"));
        bookShelf.appendBook(new Book("world"));
        bookShelf.appendBook(new Book("design"));
        bookShelf.appendBook(new Book("pattern"));

        iterator_pattern.Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void listType() {
        BookShelfWithList bookShelf = new BookShelfWithList();
        bookShelf.appendBook(new Book("hello"));
        bookShelf.appendBook(new Book("world"));
        bookShelf.appendBook(new Book("design"));
        bookShelf.appendBook(new Book("pattern"));

        java.util.Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}