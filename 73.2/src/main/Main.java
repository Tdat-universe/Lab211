package main;

import java.util.Scanner;
import consant.Message;
import controller.ExpenseController;
import dto.DTO;
import utility.Validator;
import view.ExpenseView;

public class Main {

    private static void menu() {
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Quit");
        System.out.print("Choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseController controller = new ExpenseController();
       

        int choice;

        while (true) {
            menu();
            choice = Integer.parseInt(sc.nextLine());

            if (!Validator.isLimitInRange(choice, 1, 4)) {
                System.out.println(Message.ERROR_LIMIT_RANGE);
                continue;
            }

            switch (choice) {
                case 1: { // Add
                    
                    DTO dto = new DTO();

                    System.out.print(Message.PROMT_Date + ": ");
                    dto.setDate(sc.nextLine());
                    

                    System.out.print(Message.PROMT_Money + ": ");
                    double money = Double.parseDouble(sc.nextLine());
                   
                    if (!Validator.isValidDouble(money)) {
                        System.out.println(Message.ERROR_VALID_Money);
                        break;
                    }
                    dto.setMoney(money);

                    System.out.print(Message.PROMT_Content + ": ");
                    dto.setContent(sc.nextLine());
                  

                    controller.setInput(dto);
                    controller.addExpense();
                    System.out.println("Add successful.");
                    break;
                }

                case 2: { // Display
                    controller.displayAllExpenses();
                    break;
                }

                case 3: { // Delete
                    DTO dto = new DTO();
                    System.out.print(Message.PROMT_ID + " ");
                    dto.setId(Integer.parseInt(sc.nextLine()));

                    controller.setInput(dto);
                    if (controller.deleteExpense()) {
                        System.out.println("Delete successful.");
                    } else {
                        System.out.println("Expense not found.");
                    }
                    break;
                }

                case 4: // Quit
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
