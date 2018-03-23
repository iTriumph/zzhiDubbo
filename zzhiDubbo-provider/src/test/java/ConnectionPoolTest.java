import org.junit.Test;
import zzhiDubboprovider.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhangzhii on 2018/2/22.
 */
public class ConnectionPoolTest {

    @Test
    public void test1() throws Exception {

        ConnectionPool connPool
                = new ConnectionPool("com.mysql.jdbc.Driver"
                , "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8"
                , "root"
                , "QAZwsx123");


        Connection conn=null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            conn = connPool.getConnection();


            String sql = "SELECT * FROM test.employee";

            preparedStatement = conn.prepareStatement(sql);

            //向数据库发出sql执行查询，查询出结果集
            resultSet = preparedStatement.executeQuery();
            //遍历查询结果集
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + "  " + resultSet.getString("name") + ":" + resultSet.getString("addrress"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                    connPool.returnConnection(conn);
            }

        }
    }
}
