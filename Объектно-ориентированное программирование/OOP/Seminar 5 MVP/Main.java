import Data.Student;
import Data.Teacher;
import controller.Controller;
import service.DataService;
import view.StudentView;
import view.TeacherView;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Dante",1995,"SPb",6876);
//        Student student2 = new Student("Igor",1994,"SPb",68567);
        Student student1 = new Student("Dante", 1995, "SPb", 6876);
        Student student2 = new Student("Igor", 1994, "SPb", 68567);
        Teacher teacher1 = new Teacher("Anna", 1974, "Moscow", 34);
        Teacher teacher2 = new Teacher("Eva", 1978, "Moscow", 346345);
        DataService dataService = new DataService();
        Controller controller = new Controller();
//        dataService.Create(student1);
//        dataService.Create(student2);
//        dataService.Create(teacher1);
//        dataService.Create(teacher2);
//        System.out.println(dataService.Read("Student"));
//        System.out.println(dataService.Read("Teacher"));

        controller.Create(student1);
        controller.Create(student2);
        controller.Create(teacher1);
        controller.Create(teacher2);
//        System.out.println(controller.Read("Student"));

        System.out.println("////////////////");
        StudentView studentView = new StudentView(controller);
        studentView.StudentShow();
        TeacherView teacherView = new TeacherView(controller);
        teacherView.TecherShow();
        System.out.println("////////////////");

    }
}

