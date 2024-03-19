//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package controller;

import Data.Student;
import Data.Teacher;
import Data.User;
import service.DataService;
import java.util.ArrayList;

public class Controller {
    private DataService dataService = new DataService();
    public Controller() {
    }
    public void Create(Student student) {
        this.dataService.Create(student);
    }
    public void Create(Teacher teacher){this.dataService.Create(teacher);}

    public ArrayList<User> Read(String type) {
        return this.dataService.Read(type);
    }
}
