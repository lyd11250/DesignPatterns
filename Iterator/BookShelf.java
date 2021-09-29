/**
 * 表示书架的类
 * 由于需要将该类作为集合进行处理，因此它实现了Aggregate接口
 */
public class BookShelf implements Aggregate{

    private Book[] books;

    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }
    
    /**
     * 该方法会生成并返回BookShelfIterator类的实例
     * 作为BookShelf类对应的Iterator
     * @return BookShelfIterator类的实例
     */
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}