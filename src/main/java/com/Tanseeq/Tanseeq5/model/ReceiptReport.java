package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "receipt_reports")
public class ReceiptReport extends BaseEntity {
    private String report;
    public ReceiptReport() {}
    public String getReport() { return report; }
    public void setReport(String report) { this.report = report; }
}
