package com.Tanseeq.Tanseeq5.Filters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WaterHypothesisStatisticsResponseModel {
    private List<ZoneStatisticsWaterHypothesisModel> zoneStatistics = new ArrayList<>();
    private StatisticsWaterHypothesisTotalNumberModel totalSummary = new StatisticsWaterHypothesisTotalNumberModel();
}
