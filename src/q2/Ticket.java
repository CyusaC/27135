package q2;
import java.time.LocalDate;

public final class Ticket extends Payment {
    private String ticketNumber;
    private LocalDate issueDate;

    public Ticket(int id, LocalDate createdDate, LocalDate updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  LocalDate bookingDate, String seatNumber, String travelClass,
                  LocalDate paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, LocalDate issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public void calculateFare() {
        double taxes = getBaseFare() * 0.15; // 15% tax
        double discount = getTravelClass().equalsIgnoreCase("Economy") ? 0 : getBaseFare() * 0.10;
        double totalFare = getBaseFare() + taxes - discount;

        System.out.println("\n27135 - FLIGHT TICKET");
        System.out.println("=".repeat(50));
        System.out.println("Ticket Number: 27135-" + ticketNumber);
        System.out.println("Passenger: 27135-" + getPassengerName());
        System.out.println("Flight: 27135-" + getFlightNumber());
        System.out.println("From: 27135-" + getDeparture() + " To: 27135-" + getDestination());
        System.out.println("Travel Class: 27135-" + getTravelClass());
        System.out.println("Seat: 27135-" + getSeatNumber());
        System.out.println("Base Fare: 27135-" + getBaseFare());
        System.out.println("Taxes: 27135-" + taxes);
        System.out.println("Discount: 27135-" + discount);
        System.out.println("Total Fare: 27135-" + totalFare);
        System.out.println("Issue Date: 27135-" + issueDate);
        System.out.println("=".repeat(50));
    }
}