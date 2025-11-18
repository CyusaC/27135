package q1;

import java.time.LocalDate;

public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, LocalDate createdDate, LocalDate updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit);
        if (quantityAvailable < 0) {
            throw new IllegalArgumentException("27135: Quantity available must be greater than or equal to 0");
        }
        if (reorderLevel < 0) {
            throw new IllegalArgumentException("27135: Reorder level must be greater than or equal to 0");
        }
        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable < 0) {
            throw new IllegalArgumentException("27135: Quantity available must be greater than or equal to 0");
        }
        this.quantityAvailable = quantityAvailable;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel < 0) {
            throw new IllegalArgumentException("27135: Reorder level must be greater than or equal to 0");
        }
        this.reorderLevel = reorderLevel;
    }

    @Override
    public String toString() {
        return "27135 - StockItem{" +
                "id=" + getId() +
                ", productName='" + getProductName() + '\'' +
                ", quantityAvailable=" + quantityAvailable +
                ", reorderLevel=" + reorderLevel +
                ", unitPrice=" + getUnitPrice() +
                '}';
    }
}