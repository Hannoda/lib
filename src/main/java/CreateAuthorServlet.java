import authors.Author;
import authors.IAuthor;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-author")
public class CreateAuthorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //TODO валидация параметров
        IAuthor author = new Author(request.getParameter("name"), request.getParameter("date_of_birth"), request.getParameter("biography"));
        author.createAuthor(author);
        request.getRequestDispatcher("/create-author.jsp").forward(request, response);
    }
}
