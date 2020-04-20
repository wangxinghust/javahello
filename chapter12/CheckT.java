import java.util.ArrayList;
import java.util.List;

class StrList {
    private List<String> strList = new ArrayList<String>();

    /**
     * 定义StrList的add方法
     *
     * @param ele
     * @return
     */
    public boolean add(String ele) {
        return strList.add(ele);
    }

    public String get(int index) {
        return (String) strList.get(index);
    }

    public int size() {
        return strList.size();
    }
}

public class CheckT {
    public static void main(String[] args) {
        StrList strList = new StrList();
        strList.add("AAA");
        strList.add("BBB");
        strList.add("CCC");
        // 下一行语法报错，编译异常
        //strList.add(5);
        System.out.println(strList);
        for (int i = 0; i < strList.size(); i++) {
            String str = strList.get(i);
        }
    }
}
