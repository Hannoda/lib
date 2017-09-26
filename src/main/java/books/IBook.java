package books;

import authors.IAuthor;
import genres.Genres;
import genres.IGenres;

import java.util.List;

public interface IBook {

    List<IAuthor> getAuthors();
    List<IGenres> getGenres();
}
