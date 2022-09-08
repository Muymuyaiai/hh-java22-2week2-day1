package repo;

import model.Student;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

public class StudentDB {
    private Map<Integer, Student> studentLst;


    public StudentDB(Map<Integer, Student> studentLst) {
        this.studentLst = studentLst;
    }

    public Map<Integer, Student> getAllStudents() {
        return studentLst; }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentLst=" + studentLst +
                '}';
    }

    public String randomStudent(){
        int i = (int) (Math.random() * (studentLst.size()));
        return studentLst.get(i).getName();
    }

    public void addStudent(String name, Integer id2, String course){
        Student newStudent = new Student(name, course);
        studentLst.put(id2,newStudent);
    }

    public void removeStudent(Integer id2){
        studentLst.remove(id2);
    }

    public Student findById(Integer id){
        if (studentLst.containsKey(id)){
            return studentLst.get(id);
        } else {
            throw new NullPointerException("Student ID "+ id +" does not exists");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentDB studentDB = (StudentDB) o;

        return Objects.equals(studentLst, studentDB.studentLst);
    }

    @Override
    public int hashCode() {
        return studentLst != null ? studentLst.hashCode() : 0;
    }
}
