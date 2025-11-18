package _27135.q1;

import java.time.LocalDate;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, LocalDate createdDate, LocalDate updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);
        if (categoryCode == null || !categoryCode.matches("[a-zA-Z0-9]+") || categoryCode.length() < 3) {
            throw new IllegalArgumentException("27135: Category code must be alphanumeric and at least 3 characters");
        }
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || !categoryCode.matches("[a-zA-Z0-9]+") || categoryCode.length() < 3) {
            throw new IllegalArgumentException("27135: Category code must be alphanumeric and at least 3 characters");
        }
        this.categoryCode = categoryCode;
    }

    @Override
    public String toString() {
        return "27135 - Category{" +
                "id=" + getId() +
                ", categoryName='" + categoryName + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", warehouseName='" + getWarehouseName() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", contactNumber='" + getContactNumber() + '\'' +
                '}';
    }
}