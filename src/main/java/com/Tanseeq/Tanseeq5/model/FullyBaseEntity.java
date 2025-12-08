package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class FullyBaseEntity extends BaseEntity {
    private String nameLocalized = "";
    private String name = "";

    public String getNameLocalized() { return nameLocalized; }
    public void setNameLocalized(String nameLocalized) { this.nameLocalized = nameLocalized; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
