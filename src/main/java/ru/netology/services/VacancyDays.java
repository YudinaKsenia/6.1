package ru.netology.services;

    public class VacancyDays {
        public int calculate(int income, int expenses, int threshold){

            int balance = 0;
            int result = 0;

            for (int i = 0; i < 12; i++) {
                if (balance >= threshold) {
                    balance = balance - expenses;
                    balance = balance / 3;
                    result++;
                } else {
                    balance = balance + income;
                    balance = balance - expenses;
                }
            }
            return result;
    }
}