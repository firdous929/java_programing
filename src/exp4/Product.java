package exp4;
  
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
 
 
public class Product { 
 
 public static void main(String[] args) { 
     String url = "jdbc:mysql://localhost:3306/Productdb";  
 
     String username = "root";  
 
     String password = "Firdous@001";  
 
     String query = "select * from Product";  
 
     try {  
 
         Class.forName("com.mysql.cj.jdbc.Driver");  
 
         Connection c = DriverManager.getConnection(url, username, 
password); 
 
         Statement st = c.createStatement();  
          
         ResultSet rs = st.executeQuery(query); 
           

     
         while(rs.next()) 
         { 
          System.out.println("Id: " + rs.getInt("product_id") + 
                       " , Name: " + rs.getString("product_name") + 
                       ", Price: " + rs.getFloat("price")); 
           
         } 
 
         rs.close(); 
         st.close();  
         c.close();  
         System.out.println("Connection closed.");  
     }  
     catch (ClassNotFoundException e) {  
         System.err.println("JDBC Driver not found: "  
                            + e.getMessage());  
     }  
     catch (SQLException e) {  
         System.err.println("SQL Error: "  
                            + e.getMessage());  
     }  
 
 } 
} 


