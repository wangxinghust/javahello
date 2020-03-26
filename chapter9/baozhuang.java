public class baozhuang {
    public static void main(String[] args) {
        boolean b1 = true;
        // 通过构造器将b1基本类型变量包装成包装类对象
        Boolean b1Obj = new Boolean(b1);
        int it = 5;
        Integer itObj = new Integer(it);
        // 把一个字符串转换成Float对象
        Float fl = new Float("1.23");
        // 把一个字符串转换成Boolean对象
        Boolean bObj = new Boolean("true");
        System.out.println("---------" + bObj);
        // 抛异常
        //Long lObj=new Long("ddd");
        // 取出包装中的值
        boolean bb = b1Obj.booleanValue();
        int i = itObj.intValue();
        float f = fl.floatValue();
    }
}
