package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekendServiceTest {
    @Test
    public void cntWeekOfMonth() {
        WeekendService service = new WeekendService();
        int expected = 3;
        int actual = service.calcCountMonthOff(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }
}
