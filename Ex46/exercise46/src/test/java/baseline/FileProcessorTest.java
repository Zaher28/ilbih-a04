/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    @Test
    void processFile() {

        FileProcessor fp = new FileProcessor();
        Map<String,Integer> freq = new TreeMap<>();
        freq.put("badger", 7);
        freq.put("mushroom", 2);
        freq.put("snake",1);
        assertEquals(freq,fp.processFile());

    }
}