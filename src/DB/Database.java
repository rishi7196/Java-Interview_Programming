package DB;

import java.sql.*;

public class Database {
    public static void main(String[] args) throws SQLException {

        String sql="select * from emp where id='0'";
        String url="jdbc:postgresql://locathost:8080/postgresql";
        String username="postgresql";
        String password ="0000";
        Connection con= DriverManager.getConnection(url,username,password);
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        rs.next();
        String name= rs.getString(1);
        System.out.println(name);
    }
}
