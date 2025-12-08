package com.Tanseeq.Tanseeq5.Filters;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObservedNoteRow {
    private String campNumber;
    private String squareNumber;
    private Integer waterHypothesisId; // Using Integer for nullable
    private String note;
}