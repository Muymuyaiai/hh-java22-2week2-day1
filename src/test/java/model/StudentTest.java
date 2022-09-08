package model;

import model.Student;
import org.junit.jupiter.api.Test;
import repo.StudentDB;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    /* note
    "==" means identical content (same memory address)
    "equal" (should) means that two object have the same content
     */

    @Test
    void StudentEqualsTrue (){
        Student firstStudent = new Student("Hans","Java");
        Student secondStudent = new Student("Hans","Java");
        boolean actual = firstStudent.equals(secondStudent);
        assertTrue(actual);
    }

    @Test
    void StudentEqualsFalse (){
        Student firstStudent = new Student("Hans","Java");
        Student secondStudent = new Student("Hans","Java");
        boolean actual = firstStudent.equals(secondStudent);
        assertFalse(actual);
    }


}
