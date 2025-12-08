package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "problems")
public class Problem extends BaseEntity {
    private String problem;
    public Problem() {}
    public String getProblem() { return problem; }
    public void setProblem(String problem) { this.problem = problem; }
}
