/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.*;
import java.io.*;
import consant.Message;

/**
 *
 * @author PC
 */
public class FileUtil {

    public Map<String, String> getDataFromFile() {
        Map<String, String> map = new HashMap<>();
        File file = new File(Message.FILE_NAME);
        if (!file.exists()) {
            System.err.println(Message.ERROR_FILE_EXIST);
            return map;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                
                if (data.length != 2) continue;
                map.put(data[0], data[1]);
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        return map;
    }

    public void writeDataInFile(String user, String password) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Message.FILE_NAME, true))) {
            bw.write(user + "|" + password);
            bw.newLine();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
