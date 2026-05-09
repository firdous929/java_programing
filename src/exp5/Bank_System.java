package exp5;

import java.sql.*;

public class Bank_System {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "Firdous@001"
            );
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.executeUpdate(
            "UPDATE accounts SET balance = balance - 2000 WHERE acc_no = 101");

            stmt.executeUpdate(
            "UPDATE accounts SET balance = balance + 2000 WHERE acc_no = 102");

            con.commit();

            System.out.println("Fund Transfer Successful\n");
            ResultSet rs = stmt.executeQuery("SELECT * FROM accounts");







            System.out.println("Acc_No   Name    Balance");
            while(rs.next())
            {
                System.out.println(
                rs.getInt("acc_no") + "    " +

                rs.getString("name") + "    " +
                rs.getDouble("balance"));
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

