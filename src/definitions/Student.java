/*  Created by IntelliJ IDEA.
 *  User: Hardik Pratap Singh
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private String fullNameOfStudent;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] nameOfAllTheBooksIssuedByTheStudent;

    public Student() {
        this.nameOfAllTheBooksIssuedByTheStudent = new Book[5];
        for (int i = 0; i < nameOfAllTheBooksIssuedByTheStudent.length; i++) {
            nameOfAllTheBooksIssuedByTheStudent[i] = new Book("Book" + (i + 1));
        }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNumber() == student.getStudentUniversityRollNumber() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                Objects.equals(getFirstNameOfStudent(), student.getFirstNameOfStudent()) &&
                Objects.equals(getMiddleNameOfStudent(), student.getMiddleNameOfStudent()) &&
                Objects.equals(getLastNameOfStudent(), student.getLastNameOfStudent()) &&
                Objects.equals(getFullNameOfStudent(), student.getFullNameOfStudent()) &&
                Arrays.equals(getNameOfAllTheBooksIssuedByTheStudent(), student.getNameOfAllTheBooksIssuedByTheStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstNameOfStudent(), getMiddleNameOfStudent(), getLastNameOfStudent(), getFullNameOfStudent(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getNameOfAllTheBooksIssuedByTheStudent());
        return result;
    }

    public void nameOfBooks() {
        for (Book books : this.nameOfAllTheBooksIssuedByTheStudent) {
            System.out.println(books);
        }

    }
}
