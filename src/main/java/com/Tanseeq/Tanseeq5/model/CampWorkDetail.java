package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "camp_work_details")
public class CampWorkDetail extends BaseEntity {
    private String work;
    public CampWorkDetail() {}
    public String getWork() { return work; }
    public void setWork(String work) { this.work = work; }
}
