/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import consant.Message;
import model.ExpenseModel;
import dto.DTO;
import utility.FileHandle;
import view.ExpenseView;

/**
 *
 * @author PC
 */
public class ExpenseController {

    private DTO input = new DTO();
    private ExpenseView expenseView = new ExpenseView();
    private List<ExpenseModel> listExpenseModel = new ArrayList<>();

    public void setInput(DTO input) {
        this.input = input;
    }

    public ExpenseController() {
        reloadFile();
    }

    private void reloadFile() {
        listExpenseModel.clear();
        for (String[] row : FileHandle.readFromFile(Message.FILE_NAME)) {
            listExpenseModel.add(new ExpenseModel(
                    Integer.parseInt(row[0]),
                    row[1],
                    Double.parseDouble(row[2]),
                    row[3]
            ));
        }
    }

    private int nextId() {
        return listExpenseModel.isEmpty() ? 1 : listExpenseModel.get(listExpenseModel.size() - 1).getId() + 1;
    }

    public void addExpense() {
        String record = String.format("%d  %s  %.0f  %s", nextId(), input.getDate(), input.getMoney(), input.getContent());
        FileHandle.writeNextFile(Message.FILE_NAME, record);
        reloadFile();
    }

    public boolean deleteExpense() {
        boolean removed = listExpenseModel.removeIf(e -> e.getId() == input.getId());
        if (removed) {
            FileHandle.readFromFile(Message.FILE_NAME);
        }
        return removed;
    }
    public String displayAll(){
        StringBuilder sb = new StringBuilder();
        listExpenseModel.forEach(sb::append);
        return sb.toString();
    }
    public void displayAllExpenses() {
    expenseView.setHeader("--------- Display all expenses ---------\n");
    expenseView.setBody(displayAll());
    expenseView.display();
}
}
