package authors;

import books.IBook;

import java.util.List;

public interface IAuthor {

    List<IBook> getBooks();

    void createAuthor(IAuthor author);

    void editAuthor(IAuthor author);

    void deleteAuthor();

    String getName();

    void setName(String name);

    String getDateOfBirth();

    void setDateOfBirth(String dateOfBirth);

    String getBiography();

    void setBiography(String biography);

    String getId();

    void setId(String id);
}
