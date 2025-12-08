package com.Tanseeq.Tanseeq5.dto;

import java.time.Instant;
import java.util.List;

public class HypothesisDto {
    public Long id;
    public Integer hypothesisTypeId;
    public String description;
    public Instant hypothesisDate;
    public Instant startDate;
    public Instant endDate;
    public Long intervalTime;
    public List<Long> electricalGeneratorIds;
    public List<Long> waterHypothesisIds;
    public List<Long> recommendationIds;
    public Integer orderId;
    public Integer companyId;
    public Integer zoneId;
}
