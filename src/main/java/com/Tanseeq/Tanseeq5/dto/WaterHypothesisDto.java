package com.Tanseeq.Tanseeq5.dto;

import java.time.Instant;
import java.util.List;

public class WaterHypothesisDto {
    public Long id;
    public Boolean isThereIsANote;
    public Integer campId;
    public Integer hypothesisId;
    public String location; // WKT or geo string
    public String waterHypothesisRevison;
    public Instant revisonUpdatedAt;
    public List<Long> noteIds;
}
