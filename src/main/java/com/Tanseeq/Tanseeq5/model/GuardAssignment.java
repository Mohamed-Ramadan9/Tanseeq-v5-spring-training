package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "guard_assignments")
public class GuardAssignment extends BaseEntity {
    private String assignment;
    public GuardAssignment() {}
    public String getAssignment() { return assignment; }
    public void setAssignment(String assignment) { this.assignment = assignment; }
}
