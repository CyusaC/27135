package _27135.q2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("27135 - FLIGHT BOOKING SYSTEM");
        System.out.println("=".repeat(50));

        try {
            System.out.print("Enter Entity ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Airport Name: ");
            String airportName = scanner.nextLine();
            System.out.print("Enter Airport Code (3 uppercase letters): ");
            String airportCode = scanner.nextLine();
            System.out.print("Enter Airport Location: ");
            String airportLocation = scanner.nextLine();

            System.out.print("Enter Airline Name: ");
            String airlineName = scanner.nextLine();
            System.out.print("Enter Airline Code (2-4 letters): ");
            String airlineCode = scanner.nextLine();
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();

            System.out.print("Enter Flight Number: ");
            String flightNumber = scanner.nextLine();
            System.out.print("Enter Departure: ");
            String departure = scanner.nextLine();
            System.out.print("Enter Destination: ");
            String destination = scanner.nextLine();
            System.out.print("Enter Base Fare: ");
            double baseFare = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Pilot Name: ");
            String pilotName = scanner.nextLine();
            System.out.print("Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            System.out.print("Enter Experience Years: ");
            int experienceYears = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Cabin Crew Name: ");
            String crewName = scanner.nextLine();
            System.out.print("Enter Role: ");
            String role = scanner.nextLine();
            System.out.print("Enter Shift (Day/Night): ");
            String shift = scanner.nextLine();

            System.out.print("Enter Passenger Name: ");
            String passengerName = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Enter Contact: ");
            String passengerContact = scanner.nextLine();

            System.out.print("Enter Booking Date (YYYY-MM-DD): ");
            String bookingDateStr = scanner.nextLine();
            LocalDate bookingDate = LocalDate.parse(bookingDateStr);
            System.out.print("Enter Seat Number: ");
            String seatNumber = scanner.nextLine();
            System.out.print("Enter Travel Class (Economy/Business/First): ");
            String travelClass = scanner.nextLine();

            System.out.print("Enter Payment Date (YYYY-MM-DD): ");
            String paymentDateStr = scanner.nextLine();
            LocalDate paymentDate = LocalDate.parse(paymentDateStr);
            System.out.print("Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            System.out.print("Enter Amount Paid: ");
            double amountPaid = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Ticket Number: ");
            String ticketNumber = scanner.nextLine();
            System.out.print("Enter Issue Date (YYYY-MM-DD): ");
            String issueDateStr = scanner.nextLine();
            LocalDate issueDate = LocalDate.parse(issueDateStr);

            LocalDate createdDate = LocalDate.now();
            LocalDate updatedDate = LocalDate.now();

            Ticket ticket = new Ticket(
                    id, createdDate, updatedDate,
                    airportName, airportCode, airportLocation,
                    airlineName, airlineCode, contactEmail,
                    flightNumber, departure, destination, baseFare,
                    pilotName, licenseNumber, experienceYears,
                    crewName, role, shift,
                    passengerName, age, gender, passengerContact,
                    bookingDate, seatNumber, travelClass,
                    paymentDate, paymentMethod, amountPaid,
                    ticketNumber, issueDate
            );

            ticket.calculateFare();

        } catch (Exception e) {
            System.out.println("\n27135 - ERROR: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}