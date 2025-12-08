package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "electrical_generators")
public class ElectricalGenerator extends BaseEntity {
    private String model;
    public ElectricalGenerator() {}
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}
