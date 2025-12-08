package com.Tanseeq.Tanseeq5.Filters;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteWithRevision {
    private String note;
    private Integer noteId;
}
