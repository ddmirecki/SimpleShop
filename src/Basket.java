import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Daniel on 2017-05-14.
 */
public class Basket {

    private List<Product> basketProducts = new ArrayList<>();
    private int basketId;
//    private Shop shop;


    public Basket() {
        this.basketId = new Random().nextInt(100_1000);
    }

    public void addProductToBasket(Shop shop, int id) {
        Product order = shop.getShopProductById(id);
        basketProducts.add(order);
    }

//    public int calculateBasketValue(Basket basket) {
//        int sum = 0;
//        for (Product product : basketProducts) {
//            sum += product.getPrice();
//        }
//        return sum;
//    }


    public List<Product> getBasketProducts() {
        return basketProducts;
    }

    public void setBasketProducts(List<Product> basketProducts) {
        this.basketProducts = basketProducts;
    }

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketProducts=" + basketProducts +
                ", basketId=" + basketId +
                '}';
    }
}
