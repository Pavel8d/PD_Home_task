package lesson.servlet;

import lesson.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(displayName = "Registration", urlPatterns = "/registration")

public class Registration extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("pass");
        System.out.println(name);
        System.out.println(password);

        List<User> users = (List<User>) request.getServletContext().getAttribute("users");
        boolean isUserExists = false;
        for (User user : users) {
            if (user.getName().equals(name)) {
                isUserExists = true;
                break;
            }
        }
        if (isUserExists) {
            System.out.println("Пользователь существует");
            response.sendRedirect("/hello");
        } else {
            User user1 = new User(name, password);
            users.add(new User(name, password));

            HttpSession session = request.getSession();
            session.setAttribute("name", user1);
            response.sendRedirect("/helloNewUser");
        }
    }
}

