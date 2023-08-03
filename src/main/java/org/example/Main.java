package org.example;

public class Main {public static void main(String[] args) {
    long[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    System.out.println(
            "Сумма: " + StatsService.totalSumOfSales(salesByMonth));

    System.out.println(
            "Среднее: " +
                    StatsService.averageOfSalesPerMonth(salesByMonth));

    System.out.println(
            "Месяц с последней максимальной суммой: " + StatsService.maxSales(salesByMonth));

    System.out.println(
            "Месяц с последней минимальной суммой: " +
                    StatsService.minSales(salesByMonth));

    System.out.println(
            "Количество месяцев с продажами ниже среднего: " +
                    StatsService.belowAverageSales(salesByMonth));

    System.out.println(
            "Количество месяцев с продажами выше среднего: " +
                    StatsService.aboveAverageSales(salesByMonth));
}
}