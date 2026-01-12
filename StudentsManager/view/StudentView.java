package view;

import constants.StudentType;
import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentView {

    public void showStudents(ArrayList<Student> students,
                             HashMap<Student, Double> avgMap) {
        System.out.printf("%20s%20s%15s\n", "Name", "Class", "Average");
        for (Student s : students) {
            System.out.printf("%20s%20s%15.2f\n",
                    s.getName(), s.getClassName(), avgMap.get(s));
        }
    }

    public void showClassification(HashMap<StudentType, Double> rate) {
        System.out.println("\n--- Classification ---");
        for (StudentType type : rate.keySet()) {
            System.out.printf("%s: %.2f%%\n", type, rate.get(type));
        }
    }
}
