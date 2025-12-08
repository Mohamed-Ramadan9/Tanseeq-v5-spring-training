package com.Tanseeq.Tanseeq5.Filters;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyHypothesisFilterDto {
    private Long zoneId;
    private Long hypothesisId;
    private Long page = 1L;
    private Long pageSize = 10L;
}
