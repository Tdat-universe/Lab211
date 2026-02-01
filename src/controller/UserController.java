/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import view.View;
import consant.Message;
import dto.DTO;
import model.UserModel;
import util.*;

/**
 *
 * @author PC
 */
public class UserController {

    private DTO input = new DTO();
    private View userView = new View();
    private FileUtil file = new FileUtil();
    private Map<String, String> dataUser = new HashMap<>();

    public void setInput(DTO input) {
        this.input = input;
    }

    public UserController() {
        this.dataUser = file.getDataFromFile();
    }

    public void menu() {
        userView.displayMenu();
    }

    public void createAccount() {
        String user = input.getUser();
        String password = input.getPassword();
        file.writeDataInFile(user, password);
        dataUser=file.getDataFromFile();
    }

    public boolean checkUser(String User) {
    dataUser = file.getDataFromFile();
    return dataUser.containsKey(User);
    }

    public boolean login() {
        dataUser = file.getDataFromFile();
        String user = input.getUser();
        String password = input.getPassword();
        for (Map.Entry<String, String> entry : dataUser.entrySet()) {
            if (entry.getKey().equals(user) && entry.getValue().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
