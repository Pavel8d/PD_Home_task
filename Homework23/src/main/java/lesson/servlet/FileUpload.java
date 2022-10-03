package lesson.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FileUpload", urlPatterns = "/file")
public class FileUpload extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<h1>Choose file to upload:</h1>"+
                "<form action=\"/homework23\"method=\"POST\"enctype=\"multipart/form-data\">"+
                "<input type =\"file\"><br>"+
                "<input type=\"submit\" value=\"Upload\"/>" +
                "</body>" +
                "</html>");
    }
}