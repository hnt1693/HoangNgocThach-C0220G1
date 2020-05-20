import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ServletTranslate", urlPatterns = "/translate")
public class ServletTranslate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String ,String> dict = new HashMap<>();
        dict.put("hello","Xin chào");
        dict.put("book","Sách");
        dict.put("chicken","gà");

        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String mapWord = dict.get(search);
        if(mapWord!=null){
            writer.println("<h1>" + "From" + search +" translate to Vietname is : "+ mapWord + "</h1>");
        } else {
            writer.println("<h1>" +" Word not found !!"+"</h1>");
        }


        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
