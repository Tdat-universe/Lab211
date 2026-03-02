/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.AccountDTO;
import view.View;
import model.Account;
import java.util.*;

/**
 *
 * @author PC
 */
public class AccountController {

    private Map<String, String> dataUser = new HashMap<>();

    public boolean checkExistUser(String user) {
        return dataUser.containsKey(user);
    }

    public boolean login(AccountDTO dto) {
        String user = dto.getUser();
        String password = dto.getPassword();
        if (!checkExistUser(user)) {
            return false;
        }
        return dataUser.get(user).equals(password);

    }

    public void setDataUser(Map<String, String> dataUser) {
        this.dataUser = dataUser;
    }

    public void displayMenu() {
        View.menu();
    }
}
