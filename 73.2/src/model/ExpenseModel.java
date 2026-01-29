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
    private double money;
    private String content;

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMoney(double money) {
        this.money = money;
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
        return money;
    }

    @Override
    public String toString() {
        return String.format("%-5s%-13s%-8s%-15s\n", id, date, money, content);
    }

    public String getContent() {
        return content;
    }

    public ExpenseModel(int id, String date, double money, String content) {
        this.id = id;
        this.date = date;
        this.money = money;
        this.content = content;
    }

    public ExpenseModel() {
    }
}
