import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String username = req.getParameter("uname");
        String password=req.getParameter("pwd");
        PrintWriter pw=res.getWriter();

       // RequestDispatcher requestDispatcher=req.getRequestDispatcher("go");

       /*res.sendRedirect("/go");*/

       //
       if (username.equals("akash") && password.equals("akash761"))
       {
           //requestDispatcher.forward(req,res);
           res.sendRedirect("blogpage.html");

       }

    }
}