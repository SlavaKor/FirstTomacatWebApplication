package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Slava on 8/3/15.
 */
@WebServlet("/home")
public class AdvanceServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        if(req.getParameter("uname") == null){
            req.getRequestDispatcher("/login.html").forward(req, resp);
        }
        else
            req.getRequestDispatcher("/home.html").forward(req, resp);

      //  PrintWriter p = resp.getWriter();
     //   p.println("New servlet");
    }
}
