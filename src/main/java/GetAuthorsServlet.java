import authors.AuthorsList;
import authors.IAuthorsList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/authors")
public class GetAuthorsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request = getAuthors(request);
        request.getRequestDispatcher("/authors.jsp").forward(request, response);
    }

    private HttpServletRequest getAuthors(HttpServletRequest request) {
        IAuthorsList authorsList = new AuthorsList();
        request.setAttribute("authorsList", authorsList.getAllAuthors());
        return request;
    }
}
