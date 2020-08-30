/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private String fullNameOfStudent;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] nameOfAllTheBooksIssuedByTheStudent;

    public Student() {
        firstNameOfStudent = "Hardik";
        middleNameOfStudent = "Pratap";
        lastNameOfStudent = "Singh";
        studentUniversityRollNumber = 191500310;
        numberOfBooksIssuedByStudent = 1;
    }

    public Student(String firstNameOfStudent, String middleNameOfStudent, String lastNameOfStudent, long studentUniversityRollNumber) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = middleNameOfStudent;
        this.lastNameOfStudent = lastNameOfStudent;
        this.fullNameOfStudent = firstNameOfStudent + " " + middleNameOfStudent + " " + lastNameOfStudent;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }


}
