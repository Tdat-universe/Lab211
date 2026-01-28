/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PC
 */
public class GetLocalDate {

    private GetLocalDate() {

    }

    public static String getLocalTime() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formMatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = time.format(formMatter);
        return date;
    }

}
