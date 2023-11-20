import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/grocery")
public class GroceryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Business logic (replace with your actual business logic)
        String[] groceryItems = {"Apples", "Bananas", "Milk", "Bread"};

        // Output the HTML response
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Grocery List</title></head><body>");
        out.println("<h2>Welcome to the Grocery Store!</h2>");
        out.println("<ul>");
        for (String item : groceryItems) {
            out.println("<li>" + item + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }
}
