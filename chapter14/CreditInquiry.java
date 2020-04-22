import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * 模拟对银行客户的管理
 * MenuOption.java和CreditInquiry.java
 * 在控制台显示一个文本菜单
 */
public class CreditInquiry {
    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 获取客户信息
        MenuOption accountType = getRequst(input);
        while (accountType != MenuOption.END) {
            switch (accountType) {
                case ZERO_BALANCE:
                    System.out.printf("%nAccounts with zero balances:%n");
                    break;
                case CREDIT_BALANCE:
                    System.out.printf("%nAccounts with credit balances:%n");
                    break;
                case DEBIT_BALANCE:
                    System.out.printf("%nAccounts with debit balances:%n");
                    break;
            }
            readRecords(accountType);
            accountType = getRequst(input);
        }
    }

    /**
     * 从客户处获得请求
     *
     * @param input
     * @return
     */
    private static MenuOption getRequst(Scanner input) {
        int request = 4;
        // 显示请求选项
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n", " 1 - List accounts with zero balances",
                " 2 - List accounts with credit balances", " 3 - List accounts with debit balances", " 4 - Terminate program");
        try {
            do { // 输入请求
                System.out.printf("%n");
                request = input.nextInt();
            } while ((request < 1) || (request > 4));
        } catch (NoSuchElementException e) {
            System.out.println("Invalid input . Terminating.");
        }
        return choices[request - 1];
    }

    /**
     * 读取记录文件和显示适当类型的记录
     *
     * @param accountType
     */
    private static void readRecords(MenuOption accountType) {
        try (Scanner input = new Scanner(Paths.get("chapter14\\123.txt"))) {
            while (input.hasNext()) {
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();
                // 如果是正确的账户类型则显示记录
                if (shouldDisplay(accountType, balance)) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName, lastName, balance);
                } else {
                    // 丢弃当前记录的其余部分，要求123.txt文件某位有空白行，否则最后一个\n读取不到会抛异常
                    input.nextLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error Processing file. Terminating.");
        }
    }

    /**
     * 根据记录类型确定是否显示该记录
     *
     * @param option
     * @param balance
     * @return
     */
    private static boolean shouldDisplay(MenuOption option, double balance) {
        if ((option == MenuOption.CREDIT_BALANCE) && (balance < 0)) {
            return true;
        } else if ((option == MenuOption.DEBIT_BALANCE) && (balance > 0)) {
            return true;
        } else if ((option == MenuOption.ZERO_BALANCE) && (balance == 0)) {
            return true;
        }
        return false;
    }
}
