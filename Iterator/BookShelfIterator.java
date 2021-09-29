/**
 * 用于遍历书架的类
 * 实现了Iterator接口
 */

public class BookShelfIterator implements Iterator {

    /**
     * 表示BookShelfIterator所要遍历的书架
     */
    private BookShelf bookShelf;

    /**
     * 表示迭代器当前所指向的书的下标
     */
    private int index;

    /**构造函数
     * 将接收到的BookShelf的实例保存在bookShelf字段中
     * 并将index初始化为0
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }
    
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}