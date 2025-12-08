package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "kedana_statistics")
public class KedanaStatistics extends BaseEntity {
    private String name;
    public KedanaStatistics() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
