package com.serenitydojo.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileLoader {
    public String readHelloWorld() throws IOException {
       return Files.readString(Paths.get("src/main/resources/hello.txt")); //"";
    }

    public Boolean fileContainsText(String filename, String expectedText) {
        try {
            String path = "src/main/resources/" + filename;
            return (Files.readString(Paths.get(path)).contains(expectedText)) ? true : false;
        } catch (IOException e) {
            return false;
        }
    }

    public Boolean fileHasText(String filename, String expectedText) {

        try {
            String path = "src/main/resources/" + filename;
            return (Files.readString(Paths.get(path)).contains(expectedText));
        } catch (IOException e){
            throw new MissingWelcomeFileException("No file found for "+filename,e);
        }
    }
}
