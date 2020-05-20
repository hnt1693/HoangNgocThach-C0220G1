import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCal", urlPatterns = "/calculator")
public class ServletCal extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int firstOperand = Integer.parseInt(request.getParameter("firstOp"));
        int secondOperand = Integer.parseInt(request.getParameter("secondOp"));
        String operator = request.getParameter("operator");

        int resuilt = 0;
        switch (operator) {
            case "+": {
                resuilt = firstOperand + secondOperand;
                break;
            }
            case "-": {
                resuilt = firstOperand - secondOperand;
                break;
            }
            case "*": {
                resuilt = firstOperand * secondOperand;
                break;
            }
            default: {
                if (secondOperand == 0) {
                    resuilt = 0;
                    break;
                } else {
                    resuilt = firstOperand / secondOperand;
                    break;
                }
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/caculator.jsp");
        request.setAttribute("resuilt", resuilt);
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
