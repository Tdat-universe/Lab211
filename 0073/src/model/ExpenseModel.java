/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class ExpenseModel {

    private int id;
    private String date;
    private double number;
    private String content;

    @Override
    public String toString() {
       return String.format("%-5d%-13s%-8.0f%-15s\n",
        id, date, number, content);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMoney(int money) {
        this.number = money;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getMoney() {
        return number;
    }

    public String getContent() {
        return content;
    }

    public ExpenseModel(int id, String date, int money, String content) {
        this.id = id;
        this.date = date;
        this.number = money;
        this.content = content;
    }

    public ExpenseModel() {
    }
}
