public class niming3 {
    public static void main(String[] args) {
        niming3 outer = new niming3();
        Inner inner = outer.getInner("Inner", "gz");
        System.out.println(inner.getName());
        System.out.println(inner.getProvince());
    }

    public Inner getInner(final String name, final String city) {
        return new Inner() {
            private String nameStr = name;
            private String province;

            // 实例初始化
            {
                if (city.equals("gz")) {
                    province = "gd";
                } else {
                    province = "";
                }
            }

            public String getName() {
                return nameStr;
            }

            public String getProvince() {
                return province;
            }
        };
    }
}

interface Inner {
    String getName();

    String getProvince();
}
