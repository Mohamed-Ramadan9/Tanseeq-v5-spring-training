package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "phases")
public class Phase extends BaseEntity {
    private String name;
    public Phase() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
