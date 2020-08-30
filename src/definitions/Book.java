/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfTheBook;
    private String authorOfTheBook;
    private String isbnNumberOfTheBook;

    public Book() {
        nameOfTheBook = "Name1";
        authorOfTheBook = "Author1";
        isbnNumberOfTheBook = "111111111111";
    }

    public Book(String nameOfTheBook, String authorOfTheBook, String isbnNumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.authorOfTheBook = authorOfTheBook;
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }

    public Book(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

}
