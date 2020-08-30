/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

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

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getIsbnNumberOfTheBook() {
        return isbnNumberOfTheBook;
    }

    public void setIsbnNumberOfTheBook(String isbnNumberOfTheBook) {
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }

    public void doIssue() {
        System.out.println("Thank You.....");
    }

    public void doReturn() {
        System.out.println("Thamk You for Returning the Book.");
    }

    @Override
    public String toString() {
        return "Information about the book----->\n" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                "\nauthorOfTheBook='" + authorOfTheBook + '\'' +
                "\nisbnNumberOfTheBook='" + isbnNumberOfTheBook + '\'';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(getNameOfTheBook(), book.getNameOfTheBook()) &&
                Objects.equals(getAuthorOfTheBook(), book.getAuthorOfTheBook()) &&
                Objects.equals(getIsbnNumberOfTheBook(), book.getIsbnNumberOfTheBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheBook(), getAuthorOfTheBook(), getIsbnNumberOfTheBook());
    }
}
