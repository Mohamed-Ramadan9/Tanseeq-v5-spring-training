package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "camps")
public class Camp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String campNumber;
    private String campPhoto;
    private Integer housingArea;

    private Double campArea;
    private Boolean isRented;
    private Boolean isAreaIdentical;
    private Integer campReportStatusCode;
    private String campReportStatus;

    private Integer campPhaseStatusCode;
    private String campPhaseStatus;
    private Integer capacity;
    private Double completionPercentage;
    private Boolean isIdentical;
    private Double housingPercentage;
    private Integer allocationStatusCode;
    private String allocationStatus;
    private Integer completionStatusCode;
    private String completionStatus;
    private Integer kitchenNumber;
    private Integer airConditionersNumber;
    private Integer completedAirConditionersNumber;
    private String generatorStatus;
    private Integer generatorStatusCode;
    private String transportation;
    private String nationality;
    private Integer numberOfCollectionToilets;
    private Integer companiesCount;
    private Integer numberOfToilets;
    private Integer numberOfHajjToilet;
    private Integer numberOfHajj;
    private String serviceCenterNumber;
    private String serviceCenterHeadName;
    private String serviceCenterHeadPhone;
    private String addressInfo;
    private Double lat;
    private Double lng;
    private Instant requestAdditionsDate;
    private Instant addonLicenseReceiptDate;
    private Instant startDate;
    private Instant finalDate;
    private String additionsOrderNumber;
    private String globalId;
    private Boolean addonLicense;
    private Boolean isCampAllocated = false;
    private String withdrawAllocationImg;

    private Integer consultantId;
    private Integer contractorUserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zone_id")
    private Zone zone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tent> tent = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CampServiceDetails> campServices = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CampWorkDetail> campWorkDetails = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CampAdditionDetail> campAdditionDetails = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CampWorkScoreValues> campWorkScoreValues = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CampReadinessLicense> campReadinessLicenses = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Problem> problem = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NotReceiptReport> notReceiptReports = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReceiptReport> receiptReports = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WaterHypothesis> waterHypothesis = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ElectricalHypotheses> electricalHypotheses = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Subsistence> subsistences = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AllocationOfHajj> allocationOfHajj = new ArrayList<>();
    @OneToMany(mappedBy = "camp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CenterPeopleDetails> centerPeopleDetails = new ArrayList<>();

    private Instant createdAt;
    private Instant updatedAt;

    public Camp() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getLatitude() { return lat; }
    public void setLatitude(Double latitude) { this.lat = latitude; }

    public Double getLongitude() { return lng; }
    public void setLongitude(Double longitude) { this.lng = longitude; }

    public Integer getCapacity() { return capacity; }
    public void setCapacity(Integer capacity) { this.capacity = capacity; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }


    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
