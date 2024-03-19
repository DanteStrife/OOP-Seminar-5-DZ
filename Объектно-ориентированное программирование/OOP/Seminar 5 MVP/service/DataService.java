package service;

import Data.Student;
import Data.Teacher;
import Data.User;

import java.util.ArrayList;


public class DataService {

    private ArrayList<User> StudentList = new ArrayList();
    private ArrayList<User> TeacherList = new ArrayList();

    public DataService() {
    }

    public void Create(User user) {
        if (user instanceof Student) {
            Student student = new Student(user.getFirstName(), user.getYearBorn(), user.getAddress(), this.StudentList.size() + 1);
            this.StudentList.add(student);
        } else {
            Teacher teacher = new Teacher(user.getFirstName(), user.getYearBorn(), user.getAddress(), this.TeacherList.size() + 1);
            this.TeacherList.add(teacher);
        }

    }

    public ArrayList<User> Read(String type) {
        if (type.equals("student")) {
            return StudentList;
        }
        if (type.equals("teacher")) {
            return TeacherList;
        } else {
            return null;
        }
    }

}
