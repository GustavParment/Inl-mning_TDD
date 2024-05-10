package se.reky.hakan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IOHandlerTest {

    private IOHandler ioHandler;


    private IOHandler testhandler (String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }


    @DisplayName("Testing input from  new instance of scanner")
    @Test
    void test_input_from_scanner(){

        ioHandler = testhandler("Bobrekurwa");
        assertEquals("Bobrekurwa", ioHandler.nextLine());

    }

    @DisplayName("Testing if it's true was returned")
    @Test
    void hasNextIntTest() {
        ioHandler = testhandler("1");
        assertTrue(ioHandler.hasNextInt());

    }

}