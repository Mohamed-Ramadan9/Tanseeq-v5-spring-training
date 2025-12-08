package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.*;

@Entity
@Table(name = "water_note_place_images")
public class WaterNotePlaceImage extends BaseEntity {
    private String imageUrl;

    private Integer waterNoteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "water_note_id", insertable = false, updatable = false)
    private WaterNote note;

    public WaterNotePlaceImage() {}

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public Integer getWaterNoteId() { return waterNoteId; }
    public void setWaterNoteId(Integer waterNoteId) { this.waterNoteId = waterNoteId; }

    public WaterNote getNote() { return note; }
    public void setNote(WaterNote note) { this.note = note; }
}
