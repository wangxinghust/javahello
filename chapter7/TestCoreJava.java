/**
 * JUnit单元测试 删除了JUnit4测试
 */
public class TestCoreJava {
    public void testString() {
        String original = "original value";
        modifyA(original);
        System.out.println(original);
        StringBuffer sb = new StringBuffer();
        sb.append(original);
        modifyObject(sb);
        System.out.println(sb.toString());
    }

    private void modifyA(String b) {
        b = "alterant value";
    }

    /**
     * 修改字符串
     *
     * @param 传入的字符串
     */
    public void modifyObject(StringBuffer object) {
        String b = "alterant value";
        StringBuffer sb1 = new StringBuffer();
        sb1.append(b);
        object.append(b);//注释掉后，IDEA会告知sb1未被使用。在object指向的引用没改变之前，调用append方法对其指向的堆内存中
        //内容进行修改，这可以达到修改原始StringBuffer对象sb的存放内容这个目的
        object = sb1;// 赋值运算符修改了副本对象的引用地址，使它指向了不同的堆内存
    }
}
