package q2;
import java.time.LocalDate;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, LocalDate createdDate, LocalDate updatedDate,
                   String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        if (code == null || !code.matches("[A-Z]{3}"))
            throw new IllegalArgumentException("27135: Airport code must be 3 uppercase letters");
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() { return airportName; }
    public String getCode() { return code; }
    public String getLocation() { return location; }
}
