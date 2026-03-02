package main;

import java.util.*;
import controller.AccountController;
import dto.AccountDTO;
import utils.*;
import view.View;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountController controller = new AccountController();

        // ===== LOAD FILE =====
        List<String> lines = File.loadData("user.dat");
        Map<String, String> userMap = new HashMap<>();

        int lineNumber = 0;

        for (String line : lines) {
            lineNumber++;

            if (line.trim().isEmpty()) continue;

            String[] parts = line.split(",");

            if (parts.length != 2) {
                System.out.println("Invalid format at line " + lineNumber);
                continue;
            }

            String username = parts[0].trim();
            String password = parts[1].trim();

            if (Validator.isValidUser(username) != 1) continue;
            if (Validator.isValidPassword(password) != 1) continue;
            if (userMap.containsKey(username)) continue;

            userMap.put(username, password);
        }

        // Gán dữ liệu vào controller
        controller.setDataUser(userMap);

        // ===== MENU LOOP =====
        while (true) {

            controller.displayMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter username: ");
                    String newUser = sc.nextLine();

                    System.out.print("Enter password: ");
                    String newPass = sc.nextLine();

                    if (controller.checkExistUser(newUser)) {
                        System.out.println("User already exists.");
                    } else {
                        userMap.put(newUser, newPass);
                        System.out.println("Create account successful.");
                    }
                    break;

                case 2:
                    System.out.print("Username: ");
                    String user = sc.nextLine();

                    System.out.print("Password: ");
                    String pass = sc.nextLine();

                    AccountDTO dto = new AccountDTO(user, pass);

                    if (controller.login(dto)) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Login failed.");
                    }
                    break;

                case 3:
                    System.out.println("Exit program.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}