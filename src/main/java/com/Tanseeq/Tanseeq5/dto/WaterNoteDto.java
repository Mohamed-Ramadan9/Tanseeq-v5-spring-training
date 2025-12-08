package com.Tanseeq.Tanseeq5.dto;

import java.time.Instant;
import java.util.List;

public class WaterNoteDto {
    public Long id;
    public Integer hypothesisId;
    public String noteType;
    public Integer noteSubType;
    public String anotherDetails;
    public Integer nearestRestroomNumber;
    public Integer kadanasReportNumber;
    public String revison;
    public Instant revisonUpdatedAt;
    public List<Long> caseImageIds;
    public List<Long> placeImageIds;
}
