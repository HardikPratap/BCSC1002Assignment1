/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

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

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
    }

    public String getFullNameOfStudent() {
        return fullNameOfStudent;
    }

    public void setFullNameOfStudent(String fullNameOfStudent) {
        this.fullNameOfStudent = fullNameOfStudent;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getNameOfAllTheBooksIssuedByTheStudent() {
        return nameOfAllTheBooksIssuedByTheStudent;
    }

    public void setNameOfAllTheBooksIssuedByTheStudent(Book[] nameOfAllTheBooksIssuedByTheStudent) {
        this.nameOfAllTheBooksIssuedByTheStudent = nameOfAllTheBooksIssuedByTheStudent;
    }

    @Override
    public String toString() {
        return "Student's Information" +
                "fullNameOfStudent='" + fullNameOfStudent + '\'' +
                ", studentUniversityRollNumber=" + studentUniversityRollNumber +
                ", numberOfBooksIssuedByStudent=" + numberOfBooksIssuedByStudent +
                ", nameOfAllTheBooksIssuedByTheStudent=" + Arrays.toString(nameOfAllTheBooksIssuedByTheStudent)
                ;
    }
}
