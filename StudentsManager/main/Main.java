package main;

import controller.StudentController;
import dto.StudentDTO;
import util.Validation;
import constants.Message;

public class Main {

    public static void main(String[] args) {

        StudentController controller = new StudentController();

        do {
            StudentDTO dto = new StudentDTO();
            dto.setName(Validation.getString(Message.NAME));
            dto.setClassName(Validation.getString(Message.CLASS));
            dto.setMath(Validation.getDouble("Math: ", 0, 10));
            dto.setPhysic(Validation.getDouble("Physic: ", 0, 10));
            dto.setChemistry(Validation.getDouble("Chemistry: ", 0, 10));

            controller.addStudent(dto);

        } while (Validation.confirm(Message.CONFIRM));

        controller.display();
    }
}
