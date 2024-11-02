package daypractice;

public class SchoolExample {
  public static void main(String[] args) {
    SchoolStudent student = new SchoolStudent("진");
    School school = new School("개발자학교",student);

    System.out.println(student.studentName);
    school.clean();

  }
}
