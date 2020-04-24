import java.sql.*;

/**
 * 连接本地Access数据库
 */
public class DBconnTest {
    public static void main(String[] args) {
        // 1 加载驱动程序
        String sDriver = "com.hxtt.sql.access.AccessDriver";
        try {
            Class.forName(sDriver);
        } catch (ClassNotFoundException e) {
            System.out.println("无法加载驱动程序");
            e.printStackTrace();
            return;
        }
        System.out.println("1 加载驱动程序---成功！");
        Connection dbCon = null;
        Statement stmt = null;
        String sCon = "jdbc:Access:///C:/app_portable/book.mdb";
        try {
            dbCon = DriverManager.getConnection(sCon);
            if (dbCon != null) {
                System.out.println("2 连接数据库---成功！");
            }
            // 3 建立JDBC的statement对象
            stmt = dbCon.createStatement();
            if (stmt != null) {
                System.out.println("3 建立JDBC的Statement对象---成功！");
            }
        } catch (SQLException throwables) {
            System.out.println("连接错误" + sCon);
            throwables.printStackTrace();
            if (dbCon != null) {
                try {
                    dbCon.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return;
        }
        try { // 执行数据库查询，返回结果
            String sSql = "SELECT * " + "FROM bookindex";
            ResultSet rs = stmt.executeQuery(sSql);
            while (rs.next()) {
                System.out.println(rs.getString("BookID") + "  ");
                System.out.println(rs.getString("BookTitle") + "  ");
                System.out.println(rs.getString("BookAuthor") + "  ");
                System.out.println(rs.getFloat("BookPrice"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                // 关闭步骤3所开启的Statement对象
                stmt.close();
                System.out.println("关闭Statement对象");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                // 关闭步骤2所开启的Connection连接
                dbCon.close();
                System.out.println("关闭数据库连接对象");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
