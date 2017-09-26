package authors;


import utils.Utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorsList implements IAuthorsList {

    //TODO переименовать и вынести в отдельный блок
    private static final String NAME_COL_NAME = "name";
    private static final String DATE_OF_BIRTH_COL_NAME = "date_of_birth";
    private static final String BIOGRAPHY_COL_NAME = "biography";
    private static final String AUTHOR_ID_COL_NAME = "author_ID";
    private List<IAuthor> authorsList;

    public AuthorsList(){
        authorsList = new ArrayList<IAuthor>();
    }

    public List<IAuthor> getAllAuthors(){
        ResultSet authors = Utils.selectFromDB("SELECT * FROM authors");
        if(authors!= null) {
            try {
                while (authors.next()) {
                    String name = authors.getString(NAME_COL_NAME);
                    String date_of_birth = authors.getString(DATE_OF_BIRTH_COL_NAME);
                    String biography = authors.getString(BIOGRAPHY_COL_NAME);
                    String author_ID = authors.getString(AUTHOR_ID_COL_NAME);

                    authorsList.add(new Author(name, date_of_birth, biography, author_ID));
                }
                authors.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return authorsList; //TODO если ничего не найдено
    }
}
