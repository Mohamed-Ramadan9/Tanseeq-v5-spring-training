package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "kedanas")
public class Kedana extends BaseEntity {
    private String info;
    public Kedana() {}
    public String getInfo() { return info; }
    public void setInfo(String info) { this.info = info; }
}
