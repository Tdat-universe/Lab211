/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author PC
 */
public class DTO {
    private int id;

    public DTO() {
    }
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

    public String getContent() {
        return content;
    }

    public DTO(int id, String date, double money, String content) {
        this.id = id;
        this.date = date;
        this.money = money;
        this.content = content;
    }
}
