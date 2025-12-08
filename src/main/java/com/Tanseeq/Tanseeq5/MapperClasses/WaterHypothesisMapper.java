package com.Tanseeq.Tanseeq5.MapperClasses;

import com.Tanseeq.Tanseeq5.dto.WaterHypothesisDto;
import com.Tanseeq.Tanseeq5.model.WaterHypothesis;
import com.Tanseeq.Tanseeq5.model.WaterNote;

import java.util.stream.Collectors;

public  class WaterHypothesisMapper {
    // --------------------------
    // DTO -> ENTITY (Create/Update)
    // --------------------------
    public static WaterHypothesis toEntity(WaterHypothesis entity, WaterHypothesisDto dto) {

        if (entity == null) {
            entity = new WaterHypothesis();  // creating new record
        }

        entity.setIsThereIsANote(dto.isThereIsANote);
        entity.setCampId(dto.campId);
        entity.setHypothesisId(dto.hypothesisId);
        entity.setLocation(dto.location);
        entity.setWaterHypothesisRevison(dto.waterHypothesisRevison);
        entity.setRevisonUpdatedAt(dto.revisonUpdatedAt);

        return entity;
    }


    // --------------------------
    // ENTITY -> DTO (Reading/GetById)
    // --------------------------
    public static WaterHypothesisDto toDto(WaterHypothesis entity) {

        WaterHypothesisDto dto = new WaterHypothesisDto();

        dto.id = entity.getId();
        dto.isThereIsANote = entity.getIsThereIsANote();
        dto.campId = entity.getCampId();
        dto.hypothesisId = entity.getHypothesisId();
        dto.location = entity.getLocation();
        dto.waterHypothesisRevison = entity.getWaterHypothesisRevison();
        dto.revisonUpdatedAt = entity.getRevisonUpdatedAt();

        // Only send IDs of notes (real-world practice)
        dto.noteIds = entity.getNotes()
                .stream()
                .map(WaterNote::getId)
                .collect(Collectors.toList());

        return dto;
    }
}
