package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "surveys")
public class Survey extends BaseEntity {
    private String title;
    public Survey() {}
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}
