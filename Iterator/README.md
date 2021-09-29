# Iterator模式 —— 一个一个遍历
## Iterator模式
用于在数据集合中按照顺序遍历集合。单词Iterate有反复做某件事情的意思，汉语成为“迭代器”
## 示例程序
该段示例程序的作用是将书（Book）放置到书架（BookShelf）中，并将书的名字按顺序显示出来
### 类和接口的一览表
* Aggregate —— 表示集合的接口
* Iterator —— 遍历集合的接口
* Book —— 表示书的类
* BookShelf —— 表示书架的类
* BookShelfIterator —— 遍历书架的类
* Main —— 测试程序行为的类