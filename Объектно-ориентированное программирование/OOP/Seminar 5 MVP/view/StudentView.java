package view;

import controller.Controller;
import service.DataService;

public class StudentView {
    private DataService dataService;
    private Controller controller;

    public StudentView(Controller controller) {
        this.controller = controller;

    }

    public void StudentSee() {this.dataService = new DataService();}

    public void StudentShow() {
        System.out.println(controller.Read("student"));
    }

    @Override
    public String toString() {
        return "StudentView{" +
                "dataService=" + dataService +
                ", controller=" + controller +
                '}';
    }
}
