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
       // declear
    private int id;
    private String date;
    private double money;
    private String content;

    public DTO() {
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DTO(int id, String date, double money, String content) {
        this.id = id;
        this.date = date;
        this.money = money;
        this.content = content;
    }

  

    // getId
    public int getId() {
        return id;
    }

    // setId
    public void setId(int id) {
        this.id = id;
    }

    // getDate
    public String getDate() {
        return date;
    }

    // setDate
    public void setDate(String date) {
        this.date = date;
    }

    // getMoney
    public double getMoney() {
        return money;
    }

    // setMoney
    public void setMoney(double money) {
        this.money = money;
    }

    // getContent
    public String getContent() {
        return content;
    }

}
