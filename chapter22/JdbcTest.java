import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
    public static void main(String[] args) {
        query();
    }

    private static void query() {
        java.sql.Connection conn = null;
        try {
            // 1.加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获得数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "1234");
            // 创建语句
            String sql = "select * from UserTb1";
            // 返回一个执行SQL的句柄
            java.sql.Statement stmt = conn.createStatement();
            // 4.执行查询
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            // 5.遍历结果集
            while (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                int age = rs.getInt(4);
                System.out.println(id + username + password + age);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 6.关闭数据库连接 最好改用try-with-resources语句
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    conn = null;
                    throwables.printStackTrace();
                }
            }
        }
    }
}
