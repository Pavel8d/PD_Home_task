package lesson.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EnterPassword {
    @WebServlet(name ="HelloServlet",urlPatterns = "/hello")
    public class HelloServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter writer = response.getWriter();
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            if(name!=null && password!=null){
                writer.println(String.format("Hello, %s!", name, password));
            }else {
                writer.println("Hello, stranger!");
            }
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
    }
}
