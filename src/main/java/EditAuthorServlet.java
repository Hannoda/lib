import authors.Author;
import authors.IAuthor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-author")
public class EditAuthorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //TODO данные из запроса
       // IAuthor author = new Author("Лорик", "1999-01-08", "Описание","3");
      //  author.editAuthor(author);
       // request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
