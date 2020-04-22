/**
 * 模拟对银行客户的管理
 * MenuOption.java和CreditInquiry.java
 * 枚举，定义不同的菜单选项
 */
public enum MenuOption {
    // 声明枚举的内容
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);
    private final int value;

    MenuOption(int value) {
        this.value = value;
    }
}
