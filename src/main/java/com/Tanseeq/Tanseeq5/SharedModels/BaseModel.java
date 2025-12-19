package com.Tanseeq.Tanseeq5.SharedModels;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean isDeleted = false;

    private String deleterName = "";

    private LocalDateTime deletedDate;

    private String updaterName = "";

    private LocalDateTime updateDate;

    private String modifierName = "";

    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime modifiedDate = LocalDateTime.now(ZoneOffset.ofHours(3));

    // If you're using JPA Auditing, you can also use these annotations:
    // @CreatedBy
    // @LastModifiedBy
    // @LastModifiedDate
}
