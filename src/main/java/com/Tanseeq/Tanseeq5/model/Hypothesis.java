package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hypothesis")
public class Hypothesis extends BaseEntity {
    private Integer hypothesisTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hypothesis_type_id")
    private HypothesisType hypothesisType;

    @Column(length = 2000)
    private String description;
    private Instant hypothesisDate;
    private Instant startDate;
    private Instant endDate;
    private Long intervalTime;

    @OneToMany(mappedBy = "hypothesis", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ElectricalGenerator> electricalGenerators = new ArrayList<>();

    @OneToMany(mappedBy = "hypothesis", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WaterHypothesis> waterHypothesis = new ArrayList<>();

    @OneToMany(mappedBy = "hypothesis", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HypothesisRecommendation> recommendations = new ArrayList<>();

    private Integer orderId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private Integer companyId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    private Integer zoneId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zone_id")
    private Zone zone;

    @OneToMany(mappedBy = "hypothesis", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ElectricalHypotheses> electricalHypotheses = new ArrayList<>();

    public Hypothesis() {}

    public Integer getHypothesisTypeId() { return hypothesisTypeId; }
    public void setHypothesisTypeId(Integer hypothesisTypeId) { this.hypothesisTypeId = hypothesisTypeId; }

    public HypothesisType getHypothesisType() { return hypothesisType; }
    public void setHypothesisType(HypothesisType hypothesisType) { this.hypothesisType = hypothesisType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Instant getHypothesisDate() { return hypothesisDate; }
    public void setHypothesisDate(Instant hypothesisDate) { this.hypothesisDate = hypothesisDate; }

    public Instant getStartDate() { return startDate; }
    public void setStartDate(Instant startDate) { this.startDate = startDate; }

    public Instant getEndDate() { return endDate; }
    public void setEndDate(Instant endDate) { this.endDate = endDate; }

    public Long getIntervalTime() { return intervalTime; }
    public void setIntervalTime(Long intervalTime) { this.intervalTime = intervalTime; }

    public List<WaterHypothesis> getWaterHypothesis() { return waterHypothesis; }
    public void setWaterHypothesis(List<WaterHypothesis> waterHypothesis) { this.waterHypothesis = waterHypothesis; }

    public List<HypothesisRecommendation> getRecommendations() { return recommendations; }
    public void setRecommendations(List<HypothesisRecommendation> recommendations) { this.recommendations = recommendations; }

    public Integer getOrderId() { return orderId; }
    public void setOrderId(Integer orderId) { this.orderId = orderId; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public Integer getCompanyId() { return companyId; }
    public void setCompanyId(Integer companyId) { this.companyId = companyId; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    public Integer getZoneId() { return zoneId; }
    public void setZoneId(Integer zoneId) { this.zoneId = zoneId; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }
}
