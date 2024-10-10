package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VacancyDaysTest {
    @Test
    public void testCase1() {
        VacancyDays service = new VacancyDays();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCase2() {
        VacancyDays service = new VacancyDays();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}