package _27135.q4;
import java.time.LocalDate;

public final class ProcurementReport extends Invoice {
    private LocalDate reportDate;
    private String summary;

    public ProcurementReport(int id, LocalDate createdDate, LocalDate updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, LocalDate orderDate, double totalAmount,
                             LocalDate deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             LocalDate reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy, inspectorName, status, remarks, invoiceNo, invoiceAmount);
        this.reportDate = reportDate;
        this.summary = summary;
    }

    public String calculateTotal() {
        double calculatedTotal = getUnitPrice() * getQuantity();

        System.out.println("\n27135 - PROCUREMENT REPORT");
        System.out.println("=".repeat(50));
        System.out.println("Organization: 27135-" + getOrgName());
        System.out.println("Department: 27135-" + getDeptName());
        System.out.println("Supplier: 27135-" + getSupplierName());
        System.out.println("Supplier TIN: 27135-" + getSupplierTIN());
        System.out.println("Product: 27135-" + getProductName());
        System.out.println("Quantity: 27135-" + getQuantity());
        System.out.println("Unit Price: 27135-" + getUnitPrice());
        System.out.println("Calculated Total: 27135-" + calculatedTotal);
        System.out.println("PO Number: 27135-" + getPoNumber());
        System.out.println("Invoice No: 27135-" + getInvoiceNo());
        System.out.println("Invoice Amount: 27135-" + getInvoiceAmount());
        System.out.println("Inspection Status: 27135-" + getStatus());
        System.out.println("Summary: 27135-" + summary);
        System.out.println("Report Date: 27135-" + reportDate);
        System.out.println("=".repeat(50));
        return null;
    }
}