package seminar1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
        private List<Product> products;

        public List<Product> getProducts() {
            return products;
        }

        public Shop(List<Product> products) {
            this.products = products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }

        @Override
        public String toString() {
            return "Shop=" + this.products;
        }

        /**
         * @return отсортированный по возрастанию и цене список продуктов
         */
        public List<Product> getSortedListProducts() {
            this.products.sort(Comparator.comparing(Product::getCost));
            return this.products;
        }

        /**
         * @return самый дорогой продукт
         */
        public Product getMostExpensiveProduct() {
            return Collections.max(this.products, Comparator.comparingInt(Product::getCost));
        }
}
