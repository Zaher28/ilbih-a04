/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    @Test
    void getInputFromFile() {

        FileProcessor fp = new FileProcessor();
        List<String> test = new ArrayList<>();
        test.add("Ling,Mai,55900");
        test.add("Johnson,Jim,56500");
        test.add("Jones,Aaron,46000");
        test.add("Jones,Chris,34500");
        test.add("Swift,Geoffrey,14200");
        test.add("Xiong,Fong,65000");
        test.add("Zarnecki,Sabrina,51500");
        assertEquals(test,fp.getInputFromFile());

    }

    @Test
    void processInformation() {

        FileProcessor fp = new FileProcessor();
        List<String> testInput = new ArrayList<>();
        testInput.add("Ling,Mai,55900");

        List<String> test = new ArrayList<>();
        test.add("Ling");
        test.add("Mai");
        test.add("55900");

        assertEquals(test,fp.processInformation(testInput));

    }
}