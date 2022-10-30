package lesson.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "NamePassword", urlPatterns = "/password")
public class NamePassword extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.println("<html>" +
                "<h1>REGISTRATION</h1>" +
                "<h1>Please provide your name and password:</h1>" +
                "<body>" +
                "<form action=\"/registration\" method=\"POST\">" +
                "<label>Name:" +
                "<input type=\"text\" name=\"name\"><br />" +
                "</label>" +
                "<label>Password:   " +
                "<input type=\"password\" name=\"pass\"><br />" +
                "</label>" +
                "<button type=\"submit\">Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>");
    }
}
