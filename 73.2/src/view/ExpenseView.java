/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author PC
 */
public class ExpenseView {

    // declear
    private String header;
    private String body;

    //setHeader
    public void setHeader(String header) {
        this.header = header;
    }

    //setBody 
    public void setBody(String body) {
        this.body = body;
    }

    //display 
   public void display() {
        if (header != null) {
            System.out.print(header);
        }
        if (body != null && !body.isEmpty()) {
            System.out.print(body);
        }
    }
    }
