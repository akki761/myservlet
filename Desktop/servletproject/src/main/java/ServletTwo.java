import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ServletTwo extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
    {
        int u=Integer.parseInt(req.getParameter("id"));
        PrintWriter pw=res.getWriter();
        //pw.write("Hello"+u);
        String b=req.getParameter("blogdata");

        //Q3)User should be able enter the blog data and  save it in database.

        //Q4) User should see a successful message on successful submission and error message unsuccessful submission.

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/servletassignment","root","ttn");
            PreparedStatement ps=con.prepareStatement("insert into blog values("+u+",'"+b+"')");
            ps.execute();

            pw.write("Inserted successfully in the database");
        }
        catch (Exception ex){
            pw.write("unable to insert");
        }



    }
}
