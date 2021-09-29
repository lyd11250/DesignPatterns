/**
 * 该接口用于遍历集合中的元素
 * 其作用相当于循环语句中的循环变量
 */

public interface Iterator {
    
    /**
     * 判断是否存在下一个元素
     * 主要用于循环终止条件
     */
    public abstract boolean hasNext();

    /**
     * 获取下一个元素
     * @return 集合中的一个元素
     */
    public abstract Object next();
}