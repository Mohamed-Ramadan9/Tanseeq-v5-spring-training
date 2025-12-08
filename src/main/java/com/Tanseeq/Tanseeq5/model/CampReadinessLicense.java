package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "camp_readiness_licenses")
public class CampReadinessLicense extends BaseEntity {
    private String license;
    public CampReadinessLicense() {}
    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }
}
