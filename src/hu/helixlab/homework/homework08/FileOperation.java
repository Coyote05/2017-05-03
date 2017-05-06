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

    public static void fileMaker(String place, int quantity, String nameAndExtension){

        try {

            for(int i = 1; i <= quantity; i++){

                FileWriter fileWriter = new FileWriter(place + i + nameAndExtension);
                fileWriter.write("Test");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fileMakerWithContent(String place, String nameAndExtension, String content){

        try {
            FileWriter fileWriter = new FileWriter(place + nameAndExtension);
            fileWriter.write(content);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
