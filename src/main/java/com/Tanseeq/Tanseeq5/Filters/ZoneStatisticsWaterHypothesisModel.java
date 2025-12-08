package com.Tanseeq.Tanseeq5.Filters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZoneStatisticsWaterHypothesisModel extends StatisticsWaterHypothesisTotalNumberModel {
    private Integer zoneId;
    private String zoneName = "";
}
