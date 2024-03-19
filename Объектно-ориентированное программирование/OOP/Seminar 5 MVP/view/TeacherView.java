package view;

import controller.Controller;
import service.DataService;

public class TeacherView {
    private DataService dataService;
    private Controller controller;

    public TeacherView(Controller controller) {
        this.controller = controller;

    }

    public void TeacherSee() {this.dataService = new DataService();}

    public void TecherShow() {
        System.out.println(controller.Read("teacher"));
    }

    @Override
    public String toString() {
        return "TeacherView{" +
                "dataService=" + dataService +
                ", controller=" + controller +
                '}';
    }
}
