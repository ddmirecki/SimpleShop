/**
 * Created by Daniel on 2017-05-14.
 */
public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();
        Basket basket1 = shop.newBasket();
        shop.addProductToShop(new Product("tomato", 5, 1));
        shop.addProductToShop(new Product("pork", 10, 2));
        shop.addProductToShop(new Product("salad", 2, 3));

        basket1.addProductToBasket(shop,1);
        basket1.addProductToBasket(shop, 2);

        int solution = shop.calculateBasketValue(basket1);

        System.out.println(solution);
    }
}
