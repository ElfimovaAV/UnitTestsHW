package seminar1;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTests {
    public static void main(String[] args) {
/**
 * *Задание 2. (необязательное) *
 * Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в
 * класс Shop:
 * Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
 * Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
 * Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
 * (правильное количество продуктов, верное содержимое корзины).
 * Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
 * Напишите тесты для проверки корректности работы метода sortProductsByPrice
 * (проверьте правильность сортировки). Используйте класс Product для создания экземпляров продуктов
 * и класс Shop для написания методов сортировки и тестов.
 */

        List<Product> products = new ArrayList<>();
        products.add(new Product(150, "Сurd"));
        products.add(new Product(70, "Milk"));
        products.add(new Product(250, "Cheese"));
        Shop shop = new Shop(products);
        getProductsCountTest(shop, products);
        System.out.println("Shop: " + shop.getProducts());
        sortProductsByPriceTest(shop);
        System.out.println("Products sorted by price: " + shop.getSortedListProducts());
        getMostExpensiveProductTest(shop);
        System.out.println("Most expensive product: " + shop.getMostExpensiveProduct());
    }

    /**
     * 1) Тесты ко второму заданию
     */

    //     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
    public static void getProductsCountTest(Shop shop, List<Product> products) {
        assertThat(shop.getProducts())
                .hasSize(3)
                .isEqualTo(products);
    }
    //     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
    public static void getMostExpensiveProductTest(Shop shop) {
        assertThat(shop.getMostExpensiveProduct().toString()).isEqualTo("Cheese - 250 $");
    }
    //     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    public static void sortProductsByPriceTest(Shop shop) {
        assertThat(shop.getProducts().toString())
                .isEqualTo("[Сurd - 150 $, Milk - 70 $, Cheese - 250 $]");
    }
}
