package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.Instant;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean isDeleted = false;
    private String deleterName = "";
    private Instant deletedDate;

    private String updaterName = "";
    private Instant updateDate;

    private String modifierName = "";
    private Instant modifiedDate = Instant.now();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Boolean getIsDeleted() { return isDeleted; }
    public void setIsDeleted(Boolean isDeleted) { this.isDeleted = isDeleted; }

    public String getDeleterName() { return deleterName; }
    public void setDeleterName(String deleterName) { this.deleterName = deleterName; }

    public Instant getDeletedDate() { return deletedDate; }
    public void setDeletedDate(Instant deletedDate) { this.deletedDate = deletedDate; }

    public String getUpdaterName() { return updaterName; }
    public void setUpdaterName(String updaterName) { this.updaterName = updaterName; }

    public Instant getUpdateDate() { return updateDate; }
    public void setUpdateDate(Instant updateDate) { this.updateDate = updateDate; }

    public String getModifierName() { return modifierName; }
    public void setModifierName(String modifierName) { this.modifierName = modifierName; }

    public Instant getModifiedDate() { return modifiedDate; }
    public void setModifiedDate(Instant modifiedDate) { this.modifiedDate = modifiedDate; }
}
