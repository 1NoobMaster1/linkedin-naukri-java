package OOPS;

public class Student {
    private String studentName;
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

class GS {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentName("Ayan Khan!");
        System.out.println(s.getStudentName());
    }
}
