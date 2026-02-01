package main;

import java.util.Scanner;
import consant.Message;
import controller.UserController;
import dto.DTO;
import util.Validatior;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserController controller = new UserController();

        while (true) {
            controller.menu();

            System.out.print("Choose: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number!");
                continue;
            }

            switch (choice) {
                case 1: {
                    DTO dto = new DTO();

                    System.out.println(Message.PROMT_USER);
                    String user = sc.nextLine();
                    if (!Validatior.checkUser(user)) {
                        break;
                    }

                    System.out.println(Message.PROMT_PASSWORD);
                    String password = sc.nextLine();
                    if (!Validatior.checkPassword(password)) {
                        break;
                    }

                    dto.setUser(user);
                    dto.setPassword(password);
                    controller.setInput(dto);
                    controller.createAccount();
                    System.out.println("Create account successfully!");
                    break;
                }

                case 2: {
                    DTO dto = new DTO();

                    System.out.println(Message.PROMT_USER);
                    String userLogin = sc.nextLine();
                    if (!Validatior.checkUser(userLogin)) {
                        break;
                    }

                    if (!controller.checkUser(userLogin)) {
                        System.out.println("User not exist");
                        break;
                    }

                    System.out.println(Message.PROMT_PASSWORD);
                    String passwordLogin = sc.nextLine();
                    if (!Validatior.checkPassword(passwordLogin)) {
                        break;
                    }

                    dto.setUser(userLogin);
                    dto.setPassword(passwordLogin);
                    controller.setInput(dto);

                    if (controller.login()) {
                        System.out.println(Message.LOGIN_SUCCESSFUL);
                    } else {
                        System.out.println(Message.LOGIN_FAIL);
                    }
                    break;
                }

                case 3:
                    System.out.println("Bye!");
                    sc.close();
                    return;

                default:
                    System.err.println("Invalid choice!");
            }
        }
    }
}
