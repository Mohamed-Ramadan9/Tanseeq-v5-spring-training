package com.Tanseeq.Tanseeq5.dto;
import com.Tanseeq.Tanseeq5.model.NoteTypeEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteSubTypeDto {
    private Integer id;
    private String name;
    private NoteTypeEnum parentNoteType;
}
