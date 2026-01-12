package service;

import constants.StudentType;
import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassificationService {

    public double calculateAverage(Student s) {
        return (s.getMath() + s.getPhysic() + s.getChemistry()) / 3;
    }

    public StudentType classify(Student s) {
        double avg = calculateAverage(s);
        if (avg > 7.5) return StudentType.A;
        if (avg >= 6) return StudentType.B;
        if (avg >= 4) return StudentType.C;
        return StudentType.D;
    }

    public HashMap<StudentType, Double> calculateRate(ArrayList<Student> students) {
        HashMap<StudentType, Double> result = new HashMap<>();
        int total = students.size();

        for (StudentType type : StudentType.values()) {
            result.put(type, 0.0);
        }

        for (Student s : students) {
            StudentType type = classify(s);
            result.put(type, result.get(type) + 1);
        }

        for (StudentType type : result.keySet()) {
            result.put(type, result.get(type) * 100 / total);
        }

        return result;
    }
}
