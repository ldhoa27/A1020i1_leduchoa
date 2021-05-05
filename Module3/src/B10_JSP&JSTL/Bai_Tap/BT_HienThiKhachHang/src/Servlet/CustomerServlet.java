package Servlet;

import Bean.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/abc"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "/img/anh1.jpg"));
        customerList.add(new Customer("Nguyễn Văn A","2000-08-29","Hà Nội", "/img/anh2.jpg"));
        customerList.add(new Customer("Nguyễn Văn B","2001-10-09","Hà Nội", "/img/anh3.jpg"));

        request.setAttribute("list", customerList);
        request.getRequestDispatcher("display.jsp").forward(request, response);
    }
}
