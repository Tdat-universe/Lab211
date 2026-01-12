package controller;

import dto.StudentDTO;
import model.Student;
import service.ClassificationService;
import view.StudentView;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentController {

    private final ArrayList<Student> students = new ArrayList<>();
    private final ClassificationService service = new ClassificationService();
    private final StudentView view = new StudentView();

    public void addStudent(StudentDTO dto) {
        students.add(new Student(
                dto.getName(),
                dto.getClassName(),
                dto.getMath(),
                dto.getPhysic(),
                dto.getChemistry()
        ));
    }

    public void display() {
        HashMap<Student, Double> avgMap = new HashMap<>();
        for (Student s : students) {
            avgMap.put(s, service.calculateAverage(s));
        }

        view.showStudents(students, avgMap);
        view.showClassification(service.calculateRate(students));
    }
}
    