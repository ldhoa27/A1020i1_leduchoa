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

@WebServlet(name = "CustomerServlet", urlPatterns = "/")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("Nguyễn Ngọc Phương Thảo","2002-10-11","Quảng Nam","https://i.pinimg.com/736x/76/07/5c/76075c11bfe509ee9a11d9baa991c40d.jpg"));
        customerList.add(new Customer("Nguyễn Văn A","2000-08-19","Hà Nội","https://i.pinimg.com/280x280_RS/5f/79/4f/5f794f76ac57ec354f49dc470fde3998.jpg"));
        customerList.add(new Customer("Nguyễn Văn B","2001-10-19","Hà Nội","../img/anh2.jpg"));

        request.setAttribute("list", customerList);
        request.getRequestDispatcher("display.jsp").forward(request, response);
    }
}
