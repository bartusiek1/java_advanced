package varargs;

import varargs.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentLogBook {

    private List<Student> studentList = new ArrayList<>();

    // metoda tradycyjna
    public void addStudent(String name) {
        Student student = new Student(name);
        studentList.add(student);
    }
        // metoda VARARGS - Variable Number of Arguments

        public void addStudents(String... students) {
            for (String name: students) {
                addStudent(name);
            }
            }
        }
