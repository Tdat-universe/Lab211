/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constant;

/**
 *
 * @author PC
 */
public class Message {

    private Message() {

    }
    public static final String PROMPT_Money = "Money: ";
    public static final String PROMPT_Content = "Content: ";
    public static final String PROMPT_Id = "Id: ";
    public static final String ERROR_INVALID_ID = "Id is not Valid";
    public static final String ERROR_CHOICE_LIMIT_IN_RANGE = "Please try from 1 to 4";
    public static final String ERROR_INVALID_MONEY = "Money must be greater 0";
    public static final String ERROR_INVALID_STRING = "Input is not empty";
    public static final String ERROR_FORMAT_FILE = "File is not format please try again";
    public static final String FILE_NAME = "test.txt";
    public static final String HEADER_LIST_EXPENSE = String.format("%-5s%-13s%-8s%-15s\n", "ID", "DATE", "Money", "Content");
    public static final String ERROR_FILE_EMPTY = "File is not data";
}
