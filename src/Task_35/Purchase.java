package Task_35;

public class Purchase {
    private String productName;
    private int price;
    private int numberProduct;

    public Purchase(String productName, int price, int numberProduct) {
        this.productName = productName;
        this.price = price;
        this.numberProduct = numberProduct;
    }

    public Purchase() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(int numberProduct) {
        this.numberProduct = numberProduct;
    }

    public int totalprice(){
        return price*numberProduct;
    }

    @Override
    public String toString() {
        return  productName + " " + price + " " + numberProduct + " " + totalprice();
    }


}
