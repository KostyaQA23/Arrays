import org.example.StatsService;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @org.junit.jupiter.api.Test
    void statisticSaleSum() {
        // Подготавливаем данные:
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        long actual = StatsService.totalSumOfSales(sale);

        // Задаём контрольное значение
        long expected = 180;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void statisticSaleAverageMonth(){
        // Подготавливаем данные:
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        double actual = StatsService.averageOfSalesPerMonth(sale);

        // Задаём контрольное значение
        double expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void statisticSaleMax(){
        // Подготавливаем данные:
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = StatsService.maxSales(sale);

        // Задаём контрольное значение
        long expected = 8;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void statisticSaleMin(){
        // Подготавливаем данные:
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = StatsService.minSales(sale);

        // Задаём контрольное значение
        long expected = 9;
        assertEquals(expected, actual);
    }
     @org.junit.jupiter.api.Test
    void statisticMonthUnderAverage(){
        // Подготавливаем данные:
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = StatsService.belowAverageSales(sale);

        // Задаём контрольное значение
        long expected = 5;
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void statisticMonthOverAverage(){
        // Подготавливаем данные:
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = StatsService.aboveAverageSales(sale);

        // Задаём контрольное значение
        long expected = 5;
        assertEquals(expected, actual);
    }
}
