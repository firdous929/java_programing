package studentmgt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// This mapping must match the 'action' in your index.jsp
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // 1. Retrieve parameters from index.jsp using the 'name' attributes
        int roll = Integer.parseInt(request.getParameter("rollno"));
        String name = request.getParameter("sname");
        String course = request.getParameter("course");
        double marks = Double.parseDouble(request.getParameter("marks"));

        try {
            // 2. Load the MySQL Driver (Ensure the JAR is in the lib folder you highlighted)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 3. Establish Connection (Update 'your_password' with your MySQL Workbench password)
            String url = "jdbc:mysql://localhost:3306/CollegeDB";
            Connection con = DriverManager.getConnection(url, "root", "Firdous@001");

            // 4. Create the SQL Insert Query
            String sql = "INSERT INTO Students (rollno, name, course, marks) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setDouble(4, marks);

            // 5. Execute the update
            int result = ps.executeUpdate();
            
            out.println("<html><head><style>body{font-family:Arial; text-align:center; padding-top:50px;}</style></head><body>");
            if (result > 0) {
                out.println("<h2 style='color:green;'>Registration Successful!</h2>");
                out.println("<p>Student " + name + " has been added to CollegeDB.</p>");
            } else {
                out.println("<h2 style='color:red;'>Registration Failed.</h2>");
            }
            out.println("<br><a href='index.jsp'>Add Another Student</a>");
            out.println("</body></html>");
            
            ps.close();
            con.close();
        } catch (Exception e) {
            out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
            e.printStackTrace();
        }
    }
}