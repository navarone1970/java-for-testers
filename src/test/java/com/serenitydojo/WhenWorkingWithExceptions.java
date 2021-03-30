package com.serenitydojo;

import com.serenitydojo.exceptions.FileHasNoWordException;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

public class WhenWorkingWithExceptions {
    WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldCountTheWordsInAString(){

        int numberOfWords = wordCounter.numberOfWordsIn("some string");

        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForANullString(){

        int numberOfWords = wordCounter.numberOfWordsIn(null);

        assertThat(numberOfWords).isEqualTo(0);
    }

    @Test
    public void shouldCountTheWordsInAFile() throws Exception {

        int numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");

        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test(expected = FileHasNoWordException.class)
    public void shouldReportAnErrorIfTheFileDoesNotExist() throws Exception{
        int numberOfWords = wordCounter.numberOfWordsInFile("file-that-does-not-exist");
        assertThat(numberOfWords).isEqualTo(0);
    }

    @Test(expected = FileHasNoWordException.class)
    public void shouldThrowMeaningfulExceptionIfThereAreNoWordsInTheFile() throws FileHasNoWordException {
        wordCounter.numberOfWordsInFile("src/main/resources/no_words.txt");
    }

}
