package com.coldrenatinho.lbd.model;

public class VehicleEnige {
    private Long id;
    private String Descripio;


    public VehicleEnige() {
    }

    public VehicleEnige(Long id, String descripio) {
        this.id = id;
        Descripio = descripio;
    }

    public VehicleEnige(String descripio) {
        Descripio = descripio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripio() {
        return Descripio;
    }

    public void setDescripio(String descripio) {
        Descripio = descripio;
    }

    @Override
    public String toString() {
        return "VehicleEnige{" +
                "id=" + id +
                ", Descripio='" + Descripio + '\'' +
                '}';
    }
}
