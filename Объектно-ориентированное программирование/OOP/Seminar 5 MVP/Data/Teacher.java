package Data;

import java.util.ArrayList;

public class Teacher extends User {
    private Integer TeacherID;
    private ArrayList<String> disciplesTaught;

    public Teacher(String firstName, Integer yearBorn, String address, Integer teacherID) {
        super(firstName, yearBorn, address);
        TeacherID = teacherID;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherID=" + TeacherID +
                ", disciplesTaught=" + disciplesTaught +
                ", FirstName='" + FirstName + '\'' +
                ", YearBorn=" + YearBorn +
                ", Address='" + Address + '\'' +
                '}';
    }
}



