package test.withdb;


import java.sql.*;

/**
 * @Discription
 */
public class JdbcTest {
    //数据库地址
    private static final String url = "jdbc:mysql://47.56.110.77:3306/test?characterEncoding=UTF-8";
    private static final String name = "com.mysql.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "Lingshuang1225.";
    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static Statement statement = null ;
    public static void main(String[] args) throws SQLException {
        try {
            String sql = "INSERT INTO test_name(name) VALUES('\uD83C\uDDEE苹果味香')";
            executeSql(sql);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }


    public static void  executeSql(String sql) throws SQLException, ClassNotFoundException {
            Class.forName(name);
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            statement.execute(sql);
    }
    public static ResultSet  executeQuerySql(String sql) throws SQLException, ClassNotFoundException {
        Class.forName(name);
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

}
