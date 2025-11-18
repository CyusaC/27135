package _27135.q4;
import java.time.LocalDate;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status;
    private String remarks;

    public Inspection(int id, LocalDate createdDate, LocalDate updatedDate,
                      String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, LocalDate orderDate, double totalAmount,
                      LocalDate deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy);
        if (!status.equalsIgnoreCase("Passed") && !status.equalsIgnoreCase("Failed"))
            throw new IllegalArgumentException("27135: Status must be Passed or Failed");
        this.inspectorName = inspectorName;
        this.status = status;
        this.remarks = remarks;
    }

    public String getInspectorName() { return inspectorName; }
    public String getStatus() { return status; }
    public String getRemarks() { return remarks; }
}
