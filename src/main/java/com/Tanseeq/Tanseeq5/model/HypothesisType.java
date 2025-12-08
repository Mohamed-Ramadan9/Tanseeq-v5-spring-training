package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hypothesis_types")
public class HypothesisType extends FullyBaseEntity {
    public HypothesisType() {}
}
