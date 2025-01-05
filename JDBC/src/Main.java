import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{

        /*
            import packages
            load and register Driver
            create connection
            create statement
            execute statement
            process the results
            close
         */

        //connection established
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String password = "Vivek092002#";
        String sql = "select sname from student where sid = 1";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Created ");
        //creating statement
        Statement st = con.createStatement();
        //execute statements
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        //result
        String name = rs.getString("sname");
        System.out.println("Name of the student is : " + name);

        //closing the connections
        con.close();
        System.out.println("Connection Closed");

    }
}