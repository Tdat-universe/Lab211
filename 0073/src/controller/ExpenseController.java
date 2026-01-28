/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import constant.Message;
import model.ExpenseModel;
import dto.DTO;
import view.ExpenseView;
import utils.*;

/**
 *
 * @author PC
 */
public class ExpenseController {

    private DTO input = new DTO();
    private List<ExpenseModel> listExpenses = new ArrayList<>();
    private ExpenseView expenseView = new ExpenseView();
    public List<String[]> listData = new ArrayList<>();

    public void setInput(DTO input) {
        this.input = input;
    }

    public void loadDataFromFile() {

        for (String[] strings : listData) {
            if (strings.length != 4) {
                continue;
            }
            listExpenses.add(new ExpenseModel(
                    Integer.parseInt(strings[0]),
                    strings[1], (int) Double.parseDouble(strings[2]),
                    strings[3]
            ));
        }
    }

    public void addExpenses() {
        int index = getSizeOfListExpenses();
        StringBuffer sb = new StringBuffer();
        sb.append(++index).append(", ").append(GetLocalDate.getLocalTime()).append(", ").append(input.getMoney()).append(", ").append(input.getContent());
        FileHandle.writeInFile(Message.FILE_NAME, sb.toString());
        listExpenses.clear();
        listData = FileHandle.readFromFile(Message.FILE_NAME);
        loadDataFromFile();
    }

    public int getSizeOfListExpenses() {
        return listExpenses.size();
    }
    public void displayAll(){
        StringBuilder sb = new StringBuilder();
        for(ExpenseModel expenseModel : listExpenses ){
            sb.append(expenseModel);
        }
        expenseView.setHeader(Message.HEADER_LIST_EXPENSE);
        expenseView.setBody(sb.toString());
        expenseView.display();
    }
    public void deleteExpense(){
        int id = input.getId();
        listExpenses.removeIf(e->e.getId()==id);
    }
}
