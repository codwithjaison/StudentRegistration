import java.io.*;
import javax.servlet.*;

public class StudentServlet extends GenericServlet 
{
    public void service(ServletRequest req, ServletResponse res) throws IOException 
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String course = req.getParameter("course");

        out.println("<html><body bgcolor=orange text=Black>");
        out.println("<h2>Registration Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Course: " + course + "</p>");
        out.println("</body></html>");
    }
}
