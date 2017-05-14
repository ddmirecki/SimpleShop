import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 2017-05-14.
 */
public class Shop {
    private int productsQty;
    private int prodctsValue;


    private List<Product> allProducts = new ArrayList<>();
    private Product product;
    private Basket basket;

    public Product getShopProductById(int id) {
        for (Product product : allProducts) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }

    public void addProductToShop(Product product){
        allProducts.add(product);
    }



    public int calculateBasketValue(Basket basket) {
        int sum = 0;
        for (Product product : basket.getBasketProducts()) {
            sum += (product.getPrice());
        }
        return sum;
    }


    public Basket newBasket() {
        Basket basket = new Basket();
        return basket;
    }


    public void addProductToBasket(int id){

    basket.getBasketProducts().add(getShopProductById(id));
    }



    public int getProductsQty() {
        return productsQty;
    }

    public void setProductsQty(int productsQty) {
        this.productsQty = productsQty;
    }

    public int getProdctsValue() {
        return prodctsValue;
    }

    public void setProdctsValue(int prodctsValue) {
        this.prodctsValue = prodctsValue;
    }

    public List<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(List<Product> allProducts) {
        this.allProducts = allProducts;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "productsQty=" + productsQty +
                ", prodctsValue=" + prodctsValue +
                ", allProducts=" + allProducts +
                ", product=" + product +
                ", basket=" + basket +
                '}';
    }


}
