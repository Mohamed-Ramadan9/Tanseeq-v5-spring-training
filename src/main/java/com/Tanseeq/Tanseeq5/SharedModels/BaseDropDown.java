package com.Tanseeq.Tanseeq5.SharedModels;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseDropDown {
    private Integer id;
    private String name = "";
    private String nameLocalized = "";
    private String value = "";
    private Integer parentId;
    private Boolean isEnd;
    private Integer orderInList;
}