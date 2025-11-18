package q4;
import java.time.LocalDate;

public class Delivery extends PurchaseOrder {
    private LocalDate deliveryDate;
    private String deliveredBy;

    public Delivery(int id, LocalDate createdDate, LocalDate updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, LocalDate orderDate, double totalAmount,
                    LocalDate deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        if (deliveryDate == null || deliveredBy == null)
            throw new IllegalArgumentException("27135: Delivery details cannot be null");
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }

    public LocalDate getDeliveryDate() { return deliveryDate; }
    public String getDeliveredBy() { return deliveredBy; }
}