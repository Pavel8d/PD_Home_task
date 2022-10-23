package lesson.filter;


import lesson.pojo.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(displayName = "AccessLogFilter", urlPatterns = "/file")
public class AccessLogFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        User session = (User) request.getSession().getAttribute("name");

        boolean loggedIn = session != null;
        if (loggedIn) {
            chain.doFilter(request, response);
        } else {
            response.sendRedirect("password");
        }
    }
}

