package ru.netology.stats;

public class StatsService {
    public int CalcSumSell(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int count = array[i];
            sum += count;
        }
        return sum;
    }

    public int CalcMediumSell(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int count = array[i];
            sum += count;
        }
        return sum / 12;
    }

    public int CalcMaxMonth(int[] array) {
        int monthNumber = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int count = array[i];
            if (max <= count) {
                max = count;
                monthNumber = i + 1;
            }
        }
        return monthNumber;
    }

    public int CalcMinMonth(int[] array) {
        int monthNumber = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int count = array[i];
            if (max >= count) {
                max = count;
                monthNumber = i + 1;
            }
        }
        return monthNumber;
    }

    public int CalcMonthBelowMedium(int[] array) {
        int monthCount = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int count = array[i];
            sum += count;
        }
        int medSum = sum / 12;
        for (int arr : array) {
            if (arr < medSum) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int CalcMonthHigherMedium(int[] array) {
        int monthCount = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int count = array[i];
            sum += count;
        }
        int medSum = sum / 12;
        for (int arr : array) {
            if (arr > medSum) {
                monthCount++;
            }
        }
        return monthCount;
    }


}
