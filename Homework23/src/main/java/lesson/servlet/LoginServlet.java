package lesson.servlet;

import lesson.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.println("<html>" +
                "<h1>LOGIN</h1>" +
                "<h1>Please provide your name and password:</h1>" +
                "<body>" +
                "<form action=\"/login\" method=\"POST\">" +
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("pass");
        System.out.println(name);
        System.out.println(password);

        User user1 = new User(name, password);
        HttpSession session = request.getSession();
        session.setAttribute("name", user1);
        response.sendRedirect("/file");
    }
}
