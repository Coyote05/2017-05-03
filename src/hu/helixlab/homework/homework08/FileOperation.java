package hu.helixlab.homework.homework08;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

    public static void fileMaker(String place, String nameAndExtension){

        try {
            FileWriter fileWriter = new FileWriter(place + nameAndExtension);
            fileWriter.write("Message");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
