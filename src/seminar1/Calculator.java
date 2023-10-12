package seminar1;

public class Calculator {
    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Illegal input arguments");
        }
        double amountSum = purchaseAmount * discountAmount / 100;
        return purchaseAmount - amountSum;
    }
}
