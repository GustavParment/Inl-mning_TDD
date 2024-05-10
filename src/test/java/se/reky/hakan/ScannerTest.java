package se.reky.hakan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ScannerTest {
    Scanner sc;

    @BeforeEach
    public void setUp() {
        sc = new Scanner("Hello World");
    }
    @DisplayName("Testing Scanner input")
    @Test
    void testScanner() {
        assertEquals("Hello World", sc.nextLine());
    }




}
