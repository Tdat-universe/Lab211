/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ExpenseController;
import constant.Message;
import dto.DTO;
import utils.*;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        DTO dto = new DTO();
        ExpenseController expenseController = new ExpenseController();
        expenseController.listData = FileHandle.readFromFile(Message.FILE_NAME);
        expenseController.loadDataFromFile();
        Scanner sc = new Scanner(System.in);
        int autoId = 1;
        int z = expenseController.getSizeOfListExpenses();
        System.out.println(z);
        while (true) {
            try {
                menu();
                int choice = Integer.parseInt(sc.nextLine());
                if (!Validation.isLimitInRange(choice, 1, 4)) {
                    System.out.println(Message.ERROR_CHOICE_LIMIT_IN_RANGE);
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.println(Message.PROMPT_Money);
                        double money = Double.parseDouble(sc.nextLine());
                        if (!Validation.isDouble(money)) {
                            System.err.println(Message.ERROR_INVALID_MONEY);
                            continue;
                        }

                        System.out.println(Message.PROMPT_Content);
                        String content = sc.nextLine();
                        if (!Validation.validString(content)) {
                            System.err.println(Message.ERROR_INVALID_STRING);
                            continue;
                        }

                        dto.setId(autoId);
                        dto.setMoney(money);

                        dto.setContent(content);
                        expenseController.setInput(dto);
                        expenseController.addExpenses();
                        autoId++;
                        break;
                    case 2:
                        expenseController.displayAll();
                        break;
                    case 3:
                        expenseController.displayAll();
                        int sizeOfList = expenseController.getSizeOfListExpenses();
                        System.out.println(Message.ERROR_INVALID_ID);
                        int id = Integer.parseInt(sc.nextLine());
                        if (!Validation.isInt(id)) {
                            System.err.println(Message.ERROR_INVALID_ID);
                            continue;
                        }

                        break;
                    case 4:
                        System.exit(0);
                        sc.close();
                        break;
                }

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    private static void menu() {
        System.out.println("=======Handy Expense program======");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Quit");
        System.out.print("Choice: ");
    }

}
