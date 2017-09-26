package authors;

import books.IBook;
import utils.Utils;

import java.util.List;

public class Author implements IAuthor {

    //TODO переименовать и вынести в отдельный блок (Enum)
    private static final String NAME_COL_NAME = "name";
    private static final String DATE_OF_BIRTH_COL_NAME = "date_of_birth";
    private static final String BIOGRAPHY_COL_NAME = "biography";
    private static final String AUTHOR_ID_COL_NAME = "author_ID";


    private String name;
    private String dateOfBirth;
    private String biography;
    private String id;

    public Author(String name, String dateOfBirth, String biography, String id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.biography = biography;
        this.id = id;
    }

    public Author(String name, String dateOfBirth, String biography) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.biography = biography;

    }

    @Override
    public List<IBook> getBooks() {
        return null;
    }

    @Override
    public void createAuthor(IAuthor author) {
        //TODO не забыть про валидацию
        Utils.insert("INSERT INTO authors (name, date_of_birth, biography) VALUES ('" +
                author.getName() + "','" +
                author.getDateOfBirth() + "','" +
                author.getBiography() + "')");
    }

    @Override
    public void editAuthor(IAuthor author) {
        //TODO ВЗЯТЬ ИЗ ЗАПРОС ID АВТОРА
        Utils.insert("INSERT INTO authors (name, date_of_birth,author_id, biography) VALUES ('" +
                author.getName() + "','" +
                author.getDateOfBirth() + "','" +
                author.getId() + "','" +
                author.getBiography() + "')ON CONFLICT (author_ID) DO UPDATE SET " +
                "name='" +
                author.getName() +
                "', date_of_birth='" + author.getDateOfBirth() +
                "', biography='" + author.getBiography() + "';");
    }

    @Override
    public void deleteAuthor() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getBiography() {
        return biography;
    }

    @Override
    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
