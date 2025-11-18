package q1;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) {
        if (id <= 0) {
            throw new IllegalArgumentException("27135: ID must be greater than 0");
        }
        if (createdDate == null || updatedDate == null) {
            throw new IllegalArgumentException("27135: Dates cannot be null");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("27135: ID must be greater than 0");
        }
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        if (createdDate == null) {
            throw new IllegalArgumentException("27135: Created date cannot be null");
        }
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        if (updatedDate == null) {
            throw new IllegalArgumentException("27135: Updated date cannot be null");
        }
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "27135 - Entity{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}