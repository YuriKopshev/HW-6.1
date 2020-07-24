package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSumSell() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.CalcSumSell(data);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMediumSell() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.CalcMediumSell(data);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcMaxMonth() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.CalcMaxMonth(data);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMinMonth() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.CalcMinMonth(data);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthBelowMedium() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.CalcMonthBelowMedium(data);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthHigherMedium() {
        StatsService service = new StatsService();
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.CalcMonthHigherMedium(data);
        assertEquals(expected, actual);
    }
}