package com.serenitydojo;

import com.serenitydojo.exceptions.FileHasNoWordException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {
    public int numberOfWordsIn(String value){
        if ( value == null  || value.equals("")){
            return 0;
        } else {
            return value.split("\\W").length;
        }
    }

    public int numberOfWordsInFile(String filename) throws IOException {

        try {
            String fileContents = Files.readString(Paths.get(filename));
            int wordCount = numberOfWordsIn(fileContents);
            if ( wordCount == 0){
                throw new FileHasNoWordException("No words found in the file "+filename);
            }
            return wordCount;
        } catch (NoSuchFileException noSuchFile){
            throw new FileHasNoWordException("No words found in the non-existent file "+filename);
        } finally {
            System.out.println("Processed file "+filename);
        }
    }
}
