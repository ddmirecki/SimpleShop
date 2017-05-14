/**
 * Created by Daniel on 2017-05-14.
 */
public class Product {

    private String name;
    private int price;
    private int productId;


    public Product(String name, int price, int productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productId=" + productId +
                '}';
    }
}
