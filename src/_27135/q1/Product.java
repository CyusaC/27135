package _27135.q1;

import java.time.LocalDate;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, LocalDate createdDate, LocalDate updatedDate,
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode,
                   String supplierName, String supplierEmail, String supplierPhone,
                   String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("27135: Unit price must be greater than 0");
        }
        if (stockLimit < 0) {
            throw new IllegalArgumentException("27135: Stock limit must be greater than or equal to 0");
        }
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("27135: Unit price must be greater than 0");
        }
        this.unitPrice = unitPrice;
    }

    public int getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(int stockLimit) {
        if (stockLimit < 0) {
            throw new IllegalArgumentException("27135: Stock limit must be greater than or equal to 0");
        }
        this.stockLimit = stockLimit;
    }

    @Override
    public String toString() {
        return "27135 - Product{" +
                "id=" + getId() +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", stockLimit=" + stockLimit +
                ", supplierName='" + getSupplierName() + '\'' +
                '}';
    }
}