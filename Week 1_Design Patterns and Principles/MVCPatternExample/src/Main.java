import Dependencies.Student;
import Dependencies.StudentController;
import Dependencies.StudentView;

public class Main {
    public static void main(String[] args) {
        Student model = new Student("Soumyajit Dey Sarkar", 1, "A+");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        System.out.println();
        controller.setStudentName("Sundar Pichai");
        controller.setStudentGrade("A-");
        controller.updateView();
    }
}
