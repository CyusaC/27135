package _27135.q4;
import java.time.LocalDate;

public class PurchaseOrder extends Product {
    private String poNumber;
    private LocalDate orderDate;
    private double totalAmount;

    public PurchaseOrder(int id, LocalDate createdDate, LocalDate updatedDate,
                         String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, LocalDate orderDate, double totalAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact, productName, unitPrice, quantity);
        if (totalAmount <= 0) throw new IllegalArgumentException("27135: Total amount must be > 0");
        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public String getPoNumber() { return poNumber; }
    public LocalDate getOrderDate() { return orderDate; }
    public double getTotalAmount() { return totalAmount; }
}