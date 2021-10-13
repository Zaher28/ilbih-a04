/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    NameSorter ns = new NameSorter();

    @Test
    void getInputFromFile() {

        List<String> names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");

        assertEquals(names,ns.getInputFromFile());

    }


    @Test
    void organizeNames() {
        List<String> names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");

        List<String> sortedNames = new ArrayList<>();
        names.add("Johnson, Jim");
        names.add("Jones, Aaron");
        names.add("Jones, Chris");
        names.add("Ling, Mai");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");
        names.add("Zarnecki, Sabrina");

        assertEquals(sortedNames, ns.organizeNames(names));
    }
}