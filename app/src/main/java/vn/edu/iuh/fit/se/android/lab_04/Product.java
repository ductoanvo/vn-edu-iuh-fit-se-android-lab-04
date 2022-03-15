package vn.edu.iuh.fit.se.android.lab_04;

public class Product {
    private String productName;
    private String shopName;
    private int productImage;

    public Product(String productName, String shop, int productImage) {
        this.productName = productName;
        this.shopName = shop;
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShop() {
        return shopName;
    }

    public void setShop(String shop) {
        this.shopName = shop;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", shop='" + shopName + '\'' +
                ", productImage='" + productImage + '\'' +
                '}';
    }
}
