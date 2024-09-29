package ru.netology.services;

public class WeekendService {
    public int calcCountMonthOff(int income, int expenses, int threshold) {
        int money = 0;
        int cnt = 0;

        for (int i = 1; i <= 12; i++) {
            if (money < threshold) {
                money = money + income - expenses;

            } else {
                money = (money - expenses) / 3;
                cnt++;
            }
        }
        return cnt;
    }
}