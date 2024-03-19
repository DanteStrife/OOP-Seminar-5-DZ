package Data;

public class Student extends User {
    private Integer StudentId;
    private Integer AverageMark;
//    public Student(String firstName,Integer yearBorn,String address,Integer studentId)
    public Student(String firstName,Integer yearBorn,String address,Integer studentId) {
        super(firstName, yearBorn, address);
        StudentId = studentId;
    }
    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", AverageMark=" + AverageMark +
                ", FirstName='" + FirstName + '\'' +
                ", YearBorn=" + YearBorn +
                ", Address='" + Address + '\'' +
                '}';
    }
}



