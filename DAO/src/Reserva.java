package model;

import java.time.LocalDate;

public class Reserva {
    private int id;
    private int hospedeId;
    private LocalDate dataCheckin;

    public Reserva() {}

    public Reserva(int hospedeId, LocalDate dataCheckin) {
        this.hospedeId = hospedeId;
        this.dataCheckin = dataCheckin;
    }

    // getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getHospedeId() { return hospedeId; }
    public void setHospedeId(int hospedeId) { this.hospedeId = hospedeId; }
    public LocalDate getDataCheckin() { return dataCheckin; }
    public void setDataCheckin(LocalDate dataCheckin) { this.dataCheckin = dataCheckin; }
}
