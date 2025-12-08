package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sub_zones")
public class SubZone extends BaseEntity {
    private String name;
    public SubZone() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
