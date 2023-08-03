package org.example;
import java.util.stream.*;
public class StatsService { //сумма всех продаж
    public static long totalSumOfSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++){
            sum += sales[i];
        }
        return sum;
    }

    //средняя сумма продаж в месяц
    public static double averageOfSalesPerMonth(long[] sales) {
        return totalSumOfSales(sales) / sales.length;
    }

    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public static int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public static int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public static int belowAverageSales(long[] sales) {
        double average = averageOfSalesPerMonth(sales);
        int belowAverageMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverageMonths++;
            }
        }
        return belowAverageMonths;
    }

    //количество месяцев, в которых продажи были выше среднего
    public static int aboveAverageSales(long[] sales) {
        double average = averageOfSalesPerMonth(sales);
        int aboveAverageMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverageMonths++;
            }
        }
        return aboveAverageMonths;
    }

}
