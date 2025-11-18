package _27135.q1;

import java.time.LocalDate;

public class Sale extends Purchase {
    private LocalDate saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, LocalDate createdDate, LocalDate updatedDate,
                String warehouseName, String location, String contactNumber,
                String categoryName, String categoryCode,
                String supplierName, String supplierEmail, String supplierPhone,
                String productName, double unitPrice, int stockLimit,
                int quantityAvailable, int reorderLevel,
                LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                LocalDate saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName);
        if (soldQuantity <= 0) {
            throw new IllegalArgumentException("27135: Sold quantity must be greater than 0");
        }
        if (saleDate == null) {
            throw new IllegalArgumentException("27135: Sale date cannot be null");
        }
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        if (saleDate == null) {
            throw new IllegalArgumentException("27135: Sale date cannot be null");
        }
        this.saleDate = saleDate;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity <= 0) {
            throw new IllegalArgumentException("27135: Sold quantity must be greater than 0");
        }
        this.soldQuantity = soldQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "27135 - Sale{" +
                "id=" + getId() +
                ", saleDate=" + saleDate +
                ", soldQuantity=" + soldQuantity +
                ", customerName='" + customerName + '\'' +
                ", productName='" + getProductName() + '\'' +
                '}';
    }
}