/** 表示集合的接口 
* @CreateDate: 2021/9/29 21:25
*/


public interface Aggregate {
    
    /** 
     * 该方法生成一个用于遍历集合的迭代器
     */
    public abstract Iterator iterator();
}