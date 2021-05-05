import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first = Float.parseFloat(request.getParameter("first"));
        float second = Float.parseFloat(request.getParameter("second"));
        String operator = request.getParameter("operator");
        String error="";
        float result = 0;
        try {
            switch (operator){
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if(second != 0)
                        result = first / second;
                    else
                        throw new RuntimeException("Can't divide by zero");
                default:
                    throw new RuntimeException("Invalid operation");
            }
        }catch (Exception ex){
            error = ex.getMessage();
        }
        request.setAttribute("error", error);
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
