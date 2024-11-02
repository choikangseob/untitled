package daypractice;

public class School {

  String schoolName;
  SchoolStudent schoolStudent;
  public void clean(){
    schoolStudent.clean();
  }

  public School(String schoolName, SchoolStudent schoolStudent) {
    this.schoolName = schoolName;
    this.schoolStudent = schoolStudent;
  }
}
