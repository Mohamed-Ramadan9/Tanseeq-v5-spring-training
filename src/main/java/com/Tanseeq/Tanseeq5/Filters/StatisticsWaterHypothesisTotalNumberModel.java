package com.Tanseeq.Tanseeq5.Filters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatisticsWaterHypothesisTotalNumberModel {
    private Integer campTotalNumber;
    private Integer campsWithHypothesisTotalNumber;
    private Integer campsWithHypothesisWithoutNotesTotalNumber;
    private Integer campsWithoutHypothesisTotalNumber;
}
