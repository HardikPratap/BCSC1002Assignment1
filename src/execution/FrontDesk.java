/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_A_NEW_BOOK = 1;
    public static final int RETURN_PREVIOUSLY_ISSUES_BOOK = 2;
    public static final int SHOW_ALL_ISSUED_BOOK = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        do {

            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-" + "\n" + "How may I help you today?" + "\n" + "1. Issue a new book for me."
                    + "\n" + "2. Return a previously issues book for me." + "\n" + "3. Show me all my issues books." + "\n" + "4. Exit.\n");
            userChoice = scanner.nextInt();


        } while (userChoice != EXIT);
    }
}
