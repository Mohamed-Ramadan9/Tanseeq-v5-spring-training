package com.Tanseeq.Tanseeq5.dto;

import lombok.Data;

import java.util.List;

@Data
public class PaginatedResult<T> {
    private long totalCount;
    private int pageNumber;
    private int pageSize;
    private List<T> items;
    // ctor/getters/setters
}
