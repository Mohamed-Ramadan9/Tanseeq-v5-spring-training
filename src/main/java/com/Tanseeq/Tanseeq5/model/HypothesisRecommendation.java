package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hypothesis_recommendations")
public class HypothesisRecommendation extends BaseEntity {
    private String recommendation;
    public HypothesisRecommendation() {}
    public String getRecommendation() { return recommendation; }
    public void setRecommendation(String recommendation) { this.recommendation = recommendation; }
}
