import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class fetchAllRecords {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String password = "Vivek092002#";

        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Created");

        String sql = "select * from student";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()){
            System.out.print(rs.getInt(1) + "-");
            System.out.print(rs.getString(2) + "-");
            System.out.println(rs.getInt(3));
        }

        con.close();
        System.out.println("connection closed");

    }
}
