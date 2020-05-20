import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDiscount", urlPatterns = "/ServletDiscount")
public class ServletDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String discription = request.getParameter("description");
//        Float price = Float.parseFloat(request.getParameter("price"));
//        Float percent = Float.parseFloat(request.getParameter("discount_percent"));
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<div>");
//        writer.println("<label>Product Description:</label>");
//        writer.println("</div>");
//        writer.println("</html>");
        // Set response content type
        RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
