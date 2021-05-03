import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descrption = request.getParameter("descrption");
        float price = Float.parseFloat(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount_percent"));
        float discount = price*discount_percent/100;
        float total = price-discount;
        request.setAttribute("Discount", discount);
        request.setAttribute("totalProduct", total);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
