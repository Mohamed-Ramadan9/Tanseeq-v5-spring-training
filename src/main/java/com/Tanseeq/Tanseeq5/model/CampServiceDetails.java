package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "camp_service_details")
public class CampServiceDetails extends BaseEntity {
    private String detail;
    public CampServiceDetails() {}
    public String getDetail() { return detail; }
    public void setDetail(String detail) { this.detail = detail; }
}
