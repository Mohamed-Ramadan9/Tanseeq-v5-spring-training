package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "not_receipt_reports")
public class NotReceiptReport extends BaseEntity {
    private String report;
    public NotReceiptReport() {}
    public String getReport() { return report; }
    public void setReport(String report) { this.report = report; }
}
