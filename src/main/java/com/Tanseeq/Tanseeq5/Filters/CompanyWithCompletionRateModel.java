package com.Tanseeq.Tanseeq5.Filters;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyWithCompletionRateModel {
    private String companyName;
    private Integer numOfCompletedCamp;
    private Integer numOfHypothesisUploadedWithNote;
    private Integer numOfHypothesisWithoutNote;
    private Double percentage;
    private Integer numOfNoHypothesis;
}

