package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Slava on 7/29/15.
 */
public class HelloWorldServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        String n = req.getParameter("name") == null ? "user": req.getParameter("name");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<H1> Hello " + n + "</H1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String user = req.getParameter("uname");
        String pass = req.getParameter("pass");

        PrintWriter p = resp.getWriter();
        p.println("Your name: " + user);
        p.println("Your password: " + pass);

    }
}
