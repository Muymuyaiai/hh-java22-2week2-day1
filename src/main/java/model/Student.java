package model;

import java.util.Objects;


public class Student {
    private String name;
    private String course;
    //private String course;

    public Student(String name, String course){
        this.name = name;
        this.course = course;
        //this.course = course;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }


    public static String toString(Student student){
        return "Name: " + student.name +
                "\nCourse: " + student.course;
    }

    public boolean equalsTwo(Student student){
        return this.name == student.name
                && this.course == student.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return Objects.equals(name, student.name);
    }


}

