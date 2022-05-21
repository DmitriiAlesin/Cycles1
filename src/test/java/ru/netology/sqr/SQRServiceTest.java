package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCount() {
        SQRService service = new SQRService();

         int actual = service.calcNumbersRange(200, 300);
         int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinRangeCount() {
        SQRService service = new SQRService();
        int actual = service.calcNumbersRange(200, 200);
        int expected =0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxRangeCount() {
        SQRService service = new SQRService();
        int actual = service.calcNumbersRange(300, 300);
        int expected =0;
        Assertions.assertEquals(expected, actual);
    }
}
