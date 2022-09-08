import model.Student;
import repo.StudentDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int id = 123456;
        Map<Integer, Student> mapOfStudents = new HashMap<>();
        mapOfStudents.put(1, new Student("Hans","Java"));
        StudentDB studentDB = new StudentDB(mapOfStudents);

        System.out.println(mapOfStudents.size());
        System.out.println(studentDB.findById(id));


    }
}
