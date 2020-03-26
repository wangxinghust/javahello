# javahello
初学java，参考书《java开发从入门到精通》

IDEA 常用快捷键
* Ctrl+D 复制当前行代码
* Alt+F12 打开命令行
* Ctrl+Alt+L Reformat Code
* 输入/** ,点击“Enter”，自动根据参数和返回值生成注释模板

## chapter3

基本数据类型
* char 2字节 存储Unicode码
* byte 1字节 对应C++的char

右移运算符  
\>>> 右移强制补0

## chapter5
有标号的break

## chapter6
* 强引用
* 软引用 SoftReference 适用于创建缓存

## chapter7
* transient 修饰非静态变量，与序列化有关
* synchronized 修饰方法，用于多线程同步

传递Java方法的参数方式只有一种，即使用值传递方式

Java中的引用传递对应C++中的指针传递，String字符串具有不变性，与StringBuffer不同

JUnit单元测试
* 需要添加harmcrest.jar、junit.jar包

## chapter8
* Interface中的Method都是抽象的，公有的，可以省略关键字public、abstract（仅限Java7）
* Java8新增接口的默认方法和静态方法
* Java9新增接口的私有方法，及私有静态方法

## chapter9
应用类型
1. 强引用
2. 软引用 SoftReference
3. 弱引用 WeakReference
4. 虚引用 PhantomReference

final修饰的方法不能重写，可以重载

内部类
1. 成员内部类
2. 局部内部类
3. 静态内部类
4. 匿名内部类