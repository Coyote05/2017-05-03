package hu.helixlab.homework;

import hu.helixlab.homework.homework08.FileOperation;

public class Main {

    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperation();
        fileOperation.fileMaker("C:\\Users\\C\\IdeaProjects\\2017-05-03\\src\\hu\\helixlab\\homework\\","Test.txt");

        fileOperation.fileMaker("C:\\Users\\C\\IdeaProjects\\2017-05-03\\src\\hu\\helixlab\\homework\\homework08\\", 3, "Test.txt");

        fileOperation.fileMakerWithContent("C:\\Users\\C\\IdeaProjects\\2017-05-03\\src\\hu\\helixlab\\homework\\", "Third.txt", "Message");

        fileOperation.fileMakerWithContent("C:\\Users\\C\\IdeaProjects\\2017-05-03\\src\\hu\\helixlab\\homework\\homework08\\", 5, "Fourth.txt", "Message");

        fileOperation.printMatrixFromFile();
    }
}
