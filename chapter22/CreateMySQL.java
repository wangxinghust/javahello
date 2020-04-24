import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 测试MySQL数据库是否连接成功
 */
public class CreateMySQL {
    public static void main(String[] args) {
        CreateMySQL mySQL = new CreateMySQL();
        mySQL.getConnection();
    }

    Connection conn = null;

    /**
     * 实现连接方法
     */
    private void getConnection() {
        try {
            // Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库加载成功");
            // 修改url避免因时区问题报错
            String url = "jdbc:mysql://127.0.0.1:3306/mysql?serverTimezone=CTT&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";
            String user = "root";
            String passWord = "wx4005";
            conn = DriverManager.getConnection(url, user, passWord);
            System.out.println("已成功与MySQL数据库建立连接");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
