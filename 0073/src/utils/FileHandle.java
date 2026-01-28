/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.*;
import java.util.*;
import constant.Message;
import java.text.SimpleDateFormat;

/**
 *
 * @author PC
 */
public class FileHandle {

public static List<String[]> readFromFile(String fileName) {
    List<String[]> listString = new ArrayList<>();
    File file = new File(fileName);

    if (!file.exists()) {
        System.out.println(Message.ERROR_FILE_EMPTY);
        return listString;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();

            if (line.isEmpty()) continue;
            if (line.toLowerCase().startsWith("id")) continue;
            if (line.toLowerCase().startsWith("total")) continue;

            String[] parts = line.split("\\s+");
            if (parts.length < 4) continue;

            try {
                int id = Integer.parseInt(parts[0]);
                String date = parts[1];
                double money = Double.parseDouble(parts[2]);

                String content = String.join(" ",
                        java.util.Arrays.copyOfRange(parts, 3, parts.length));

                if (!Validation.isInt(id)) continue;
                if (!Validation.isDouble(money)) continue;
                if (!Validation.validString(content)) continue;

                listString.add(new String[]{
                    String.valueOf(id), date, String.valueOf(money), content
                });

            } catch (Exception e) {
                // bỏ dòng lỗi
            }
        }
    } catch (Exception e) {
        System.err.println(e);
    }
    return listString;
}
    public static void writeInFile(String fileName, String input){
        File file = new File(fileName);
        if(!file.exists()){
            System.err.println(Message.ERROR_FILE_EMPTY);
           return;    
        }
        try{
            FileWriter fr = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write("\n");
            bw.write(input);
            bw.close();
            fr.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }

}
