package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "water_hypothesis")
public class WaterHypothesis extends FullyBaseEntity {
    private Boolean isThereIsANote;

    private Integer campId;
    private Integer hypothesisId;

    // Location: original C# uses NetTopologySuite Point; here we store as WKT string
    @Column(length = 1000)
    private String location;

    private String waterHypothesisRevison = "";
    private Instant revisonUpdatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "camp_id", insertable = false, updatable = false)
    private Camp camp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hypothesis_id", insertable = false, updatable = false)
    private Hypothesis hypothesis;

    @OneToMany(mappedBy = "hypothesis", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WaterNote> notes = new ArrayList<>();

    public WaterHypothesis() {}

    public Boolean getIsThereIsANote() { return isThereIsANote; }
    public void setIsThereIsANote(Boolean isThereIsANote) { this.isThereIsANote = isThereIsANote; }

    public Integer getCampId() { return campId; }
    public void setCampId(Integer campId) { this.campId = campId; }

    public Integer getHypothesisId() { return hypothesisId; }
    public void setHypothesisId(Integer hypothesisId) { this.hypothesisId = hypothesisId; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getWaterHypothesisRevison() { return waterHypothesisRevison; }
    public void setWaterHypothesisRevison(String waterHypothesisRevison) { this.waterHypothesisRevison = waterHypothesisRevison; }

    public Instant getRevisonUpdatedAt() { return revisonUpdatedAt; }
    public void setRevisonUpdatedAt(Instant revisonUpdatedAt) { this.revisonUpdatedAt = revisonUpdatedAt; }

    public Camp getCamp() { return camp; }
    public void setCamp(Camp camp) { this.camp = camp; }

    public Hypothesis getHypothesis() { return hypothesis; }
    public void setHypothesis(Hypothesis hypothesis) { this.hypothesis = hypothesis; }

    public List<WaterNote> getNotes() { return notes; }
    public void setNotes(List<WaterNote> notes) { this.notes = notes; }
}
