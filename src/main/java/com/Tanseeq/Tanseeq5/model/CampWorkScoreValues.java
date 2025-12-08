package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "camp_work_score_values")
public class CampWorkScoreValues extends BaseEntity {
    private Double score;
    public CampWorkScoreValues() {}
    public Double getScore() { return score; }
    public void setScore(Double score) { this.score = score; }
}
