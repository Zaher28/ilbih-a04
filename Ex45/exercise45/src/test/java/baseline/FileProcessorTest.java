package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    @Test
    void processFile() {

        FileProcessor fp = new FileProcessor();

        assertEquals(1, fp.processFile());

    }
}