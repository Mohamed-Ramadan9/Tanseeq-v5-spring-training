package com.Tanseeq.Tanseeq5.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteSubTypeCountModel {
    private String noteType;
    private Integer noteSubType; // Using Integer for nullable
    private Integer count;
    private String subTypeDisplayName; // Optional display name
}
