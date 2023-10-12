package seminar1;

import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;
public class CalculatorTests {
    public static void main(String[] args) {
        /**
         * Задание 1. ** В классе seminar1.Calculator создайте метод calculateDiscount, который принимает сумму покупки
         * и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с
         * использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы,
         * он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.
         */
        double purchaseAmount = 5000;
        int discountAmount = 20;
        expectedResult(purchaseAmount, discountAmount);
        System.out.println("Сумма покупки с учетом скидки равна " +
                Calculator.calculatingDiscount(purchaseAmount, discountAmount) + " рублей");
    }

    /**
     * 1) Тесты к первому заданию
     */
    public static void expectedResult(double purchaseAmount, int discountAmount) {
        Assertions.assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90);
        assertThat(discountAmount)
                .isGreaterThanOrEqualTo(0)
                .isLessThanOrEqualTo(100);
        assertThat(purchaseAmount).isGreaterThanOrEqualTo(0);
        Assertions.assertThat(Calculator.calculatingDiscount(purchaseAmount, discountAmount)).isEqualTo(purchaseAmount * (100 - discountAmount) / 100);

    }
}