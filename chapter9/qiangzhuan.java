public class qiangzhuan {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        System.out.println(l);
        int in = 5;
        // 编译报错，无法强制转换
        //boolean b=(boolean)in;
        Object obj = "Hello";
        String objStr = (String) obj;
        System.out.println(objStr);
        Object objPri = new Integer(5);
        // 抛异常，实际类型不同。为解决该异常，可以先instanceof判断一下是否可以转换
        String str = (String) objPri;
    }
}
