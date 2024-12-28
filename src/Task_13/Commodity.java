package Task_13;

import java.util.Objects;

public class Commodity {
    private String nameProduct;//название товара
    private int priseProduct;//цена в копейках.

    public Commodity() {

    }

    public Commodity(String nameProduct, int priseProduct) {
        this.nameProduct = nameProduct;
        this.priseProduct = priseProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriseProduct() {
        return priseProduct;
    }

    public void setPriseProduct(int priseProduct) {
        this.priseProduct = priseProduct;
    }

    @Override
    public String toString() {
        return nameProduct + ';' + priseProduct;
    }

    public void show() {
        System.out.println("Наименование товара: " + nameProduct);
        System.out.println("Цена товара: " + priseProduct);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Commodity commodity)) return false;
        return (nameProduct.equals(commodity.getNameProduct()) & priseProduct == commodity.getPriseProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, priseProduct);
    }
}
