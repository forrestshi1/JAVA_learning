import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


@SuppressWarnings({"all"})
public class ResultSet_ {
    public static void main(String[] args) throws Exception {

        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //1. 注册驱动
        Class.forName(driver);//建议写上

        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. 得到Statement
        Statement statement = connection.createStatement();
        //4. 组织SqL
        String sql = "select * from mes";
        //执行给定的SQL语句，该语句返回单个 ResultSet对象
        ResultSet resultSet = statement.executeQuery(sql);

        //5. 使用while取出数据
        while (resultSet.next()) { // 让光标向后移动，如果没有更多行，则返回false
            int id  = resultSet.getInt(1); //获取该行的第1列
            //int id1 = resultSet.getInt("id"); 通过列名来获取值, 推荐
            String content = resultSet.getString(2);//获取该行的第2列
            Date send_time = resultSet.getDate(3);

            System.out.println(id + "\t" + content + "\t" + send_time+ "\t" );
        }

        //6. 关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
