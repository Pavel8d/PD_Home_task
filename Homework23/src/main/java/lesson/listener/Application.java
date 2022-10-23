package lesson.listener;

import lesson.pojo.User;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class Application implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        List<User> users = new ArrayList<>();
        System.out.println("application started");
        servletContextEvent.getServletContext().setAttribute("users", users);
    }
}
