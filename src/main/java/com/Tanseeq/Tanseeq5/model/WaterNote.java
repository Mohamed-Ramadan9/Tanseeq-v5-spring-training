package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "water_note")
public class WaterNote extends FullyBaseEntity {
    private Integer hypothesisId;

    private String noteType; // maps to NoteTypeEnum in C#
    private Integer noteSubType;

    @Column(length = 2000)
    private String anotherDetails;

    private Integer nearestRestroomNumber;
    private Integer kadanasReportNumber;
    private String revison = "";
    private Instant revisonUpdatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hypothesis_id", insertable = false, updatable = false)
    private WaterHypothesis hypothesis;

    @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WaterNoteCaseImage> caseImages = new ArrayList<>();

    @OneToMany(mappedBy = "note", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WaterNotePlaceImage> placeImages = new ArrayList<>();

    public WaterNote() {}

    public Integer getHypothesisId() { return hypothesisId; }
    public void setHypothesisId(Integer hypothesisId) { this.hypothesisId = hypothesisId; }

    public String getNoteType() { return noteType; }
    public void setNoteType(String noteType) { this.noteType = noteType; }

    public Integer getNoteSubType() { return noteSubType; }
    public void setNoteSubType(Integer noteSubType) { this.noteSubType = noteSubType; }

    public String getAnotherDetails() { return anotherDetails; }
    public void setAnotherDetails(String anotherDetails) { this.anotherDetails = anotherDetails; }

    public Integer getNearestRestroomNumber() { return nearestRestroomNumber; }
    public void setNearestRestroomNumber(Integer nearestRestroomNumber) { this.nearestRestroomNumber = nearestRestroomNumber; }

    public Integer getKadanasReportNumber() { return kadanasReportNumber; }
    public void setKadanasReportNumber(Integer kadanasReportNumber) { this.kadanasReportNumber = kadanasReportNumber; }

    public String getRevison() { return revison; }
    public void setRevison(String revison) { this.revison = revison; }

    public Instant getRevisonUpdatedAt() { return revisonUpdatedAt; }
    public void setRevisonUpdatedAt(Instant revisonUpdatedAt) { this.revisonUpdatedAt = revisonUpdatedAt; }

    public WaterHypothesis getHypothesis() { return hypothesis; }
    public void setHypothesis(WaterHypothesis hypothesis) { this.hypothesis = hypothesis; }

    public List<WaterNoteCaseImage> getCaseImages() { return caseImages; }
    public void setCaseImages(List<WaterNoteCaseImage> caseImages) { this.caseImages = caseImages; }

    public List<WaterNotePlaceImage> getPlaceImages() { return placeImages; }
    public void setPlaceImages(List<WaterNotePlaceImage> placeImages) { this.placeImages = placeImages; }
}
