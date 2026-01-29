/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.io.*;
import java.util.*;
import consant.Message;

/**
 *
 * @author PC
 */
public class FileHandle {

    public static List<String[]> readFromFile(String fileName) {
        List<String[]> list = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println(Message.ERROR_NOT_EXIST);
            return list;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split("\\s+", 4);
                if (parts.length < 4) {
                    System.out.println(Message.ERROR_FILE_NOT_FORMAT);
                    continue;
                }
                Integer.parseInt(parts[0]);
                Double.parseDouble(parts[2]);
                list.add(parts);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }

    public static void writeNextFile(String fileName, String input) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(input);
            bw.newLine();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
