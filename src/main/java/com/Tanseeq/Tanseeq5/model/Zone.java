package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zones")
public class Zone extends FullyBaseEntity {
    private String address;

    @OneToMany(mappedBy = "square", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Square> square = new ArrayList<>();

    @OneToMany(mappedBy = "zone", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Camp> camp = new ArrayList<>();

    @OneToMany(mappedBy = "zone", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Hypothesis> hypothesis = new ArrayList<>();

    @OneToMany(mappedBy = "zone", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HypothesisRecommendation> recommendations = new ArrayList<>();

    public Zone() {}

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public List<Square> getSquare() { return square; }
    public void setSquare(List<Square> square) { this.square = square; }

    public List<Camp> getCamp() { return camp; }
    public void setCamp(List<Camp> camp) { this.camp = camp; }

    public List<Hypothesis> getHypothesis() { return hypothesis; }
    public void setHypothesis(List<Hypothesis> hypothesis) { this.hypothesis = hypothesis; }

    public List<HypothesisRecommendation> getRecommendations() { return recommendations; }
    public void setRecommendations(List<HypothesisRecommendation> recommendations) { this.recommendations = recommendations; }
}
