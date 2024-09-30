package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class WeekendServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/weekend.csv")
    public void cntWeekOfMonth(int income, int expenses, int threshold, int expected) {
        WeekendService service = new WeekendService();
        int actual = service.calcCountMonthOff(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}