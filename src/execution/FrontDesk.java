/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_A_NEW_BOOK = 1;
    public static final int RETURN_PREVIOUSLY_ISSUES_BOOK = 2;
    public static final int SHOW_ALL_ISSUED_BOOK = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Book myBook = new Book();
        Student mystudent = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String studentName = scanner.next();
        mystudent.setFullNameOfStudent(studentName);
        int userChoice;
        do {

            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-" + "\n" + "How may I help you today?" + "\n" + "1. Issue a new book for me."
                    + "\n" + "2. Return a previously issues book for me." + "\n" + "3. Show me all my issues books." + "\n" + "4. Exit.\n");
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case ISSUE_A_NEW_BOOK:
                    System.out.println("Enter the name of Book you want to issue");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    myBook.issueBook(bookName);
                    break;
                case RETURN_PREVIOUSLY_ISSUES_BOOK:
                    System.out.println("Enter the name of the Book you want to return");
                    String returnBookName = scanner.nextLine();
                    scanner.nextLine();
                    myBook.doReturn();
                    break;
                case SHOW_ALL_ISSUED_BOOK:

                    String nameOfBooks = scanner.nextLine();
                    mystudent.nameOfBooks();
                    break;
                case EXIT:
                    System.out.println("Thanks For Using Front Desk!!!");
                    break;
                default:
                    System.out.println("Wrong Option!!");

            }

        } while (userChoice != EXIT);
    }
}
