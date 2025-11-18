package _27135.q1;

import java.time.LocalDate;

public class Purchase extends StockItem {
    private LocalDate purchaseDate;
    private int purchasedQuantity;
    private String purchaseSupplierName;

    public Purchase(int id, LocalDate createdDate, LocalDate updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        if (purchasedQuantity <= 0) {
            throw new IllegalArgumentException("27135: Purchased quantity must be greater than 0");
        }
        if (purchaseDate == null) {
            throw new IllegalArgumentException("27135: Purchase date cannot be null");
        }
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.purchaseSupplierName = purchaseSupplierName;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        if (purchaseDate == null) {
            throw new IllegalArgumentException("27135: Purchase date cannot be null");
        }
        this.purchaseDate = purchaseDate;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0) {
            throw new IllegalArgumentException("27135: Purchased quantity must be greater than 0");
        }
        this.purchasedQuantity = purchasedQuantity;
    }

    public String getPurchaseSupplierName() {
        return purchaseSupplierName;
    }

    public void setPurchaseSupplierName(String purchaseSupplierName) {
        this.purchaseSupplierName = purchaseSupplierName;
    }

    @Override
    public String toString() {
        return "27135 - Purchase{" +
                "id=" + getId() +
                ", purchaseDate=" + purchaseDate +
                ", purchasedQuantity=" + purchasedQuantity +
                ", purchaseSupplierName='" + purchaseSupplierName + '\'' +
                ", productName='" + getProductName() + '\'' +
                '}';
    }
}