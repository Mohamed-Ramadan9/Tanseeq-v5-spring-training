package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // inherited id and audit fields from FullyBaseEntity
    private String companyNumber;
    private String email;
    private String phone;
    private String logo;
    private String cover;
    private String dashboardName;
    private String dashboardSrc;

    private String managerFirstName;
    private String managerFirstNameLocalized;
    private String managerLastName;
    private String managerLastNameLocalized;
    private String managerNationalIdFront;
    private String managerNationalIdBack;

    private String businessLandLine;
    private String contractArabianNumber;
    private String contractSouthEastAsiaNumber;
    private String contractSouthAsiaNumber;
    private String contractNonArabianNumber;

    private String state;
    private Integer stateCode;
    private Boolean isDeveloper = Boolean.FALSE;
    private String color;

    // Foreign key references kept as Long (related entities available elsewhere)
    private Integer zoneManagerId;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Square> square = new ArrayList<>();

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Camp> camp = new ArrayList<>();

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Hypothesis> hypothesis = new ArrayList<>();

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDashboardName() {
        return dashboardName;
    }

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    public String getDashboardSrc() {
        return dashboardSrc;
    }

    public void setDashboardSrc(String dashboardSrc) {
        this.dashboardSrc = dashboardSrc;
    }

    public String getManagerFirstName() {
        return managerFirstName;
    }

    public void setManagerFirstName(String managerFirstName) {
        this.managerFirstName = managerFirstName;
    }

    public String getManagerFirstNameLocalized() {
        return managerFirstNameLocalized;
    }

    public void setManagerFirstNameLocalized(String managerFirstNameLocalized) {
        this.managerFirstNameLocalized = managerFirstNameLocalized;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public void setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
    }

    public String getManagerLastNameLocalized() {
        return managerLastNameLocalized;
    }

    public void setManagerLastNameLocalized(String managerLastNameLocalized) {
        this.managerLastNameLocalized = managerLastNameLocalized;
    }

    public String getManagerNationalIdFront() {
        return managerNationalIdFront;
    }

    public void setManagerNationalIdFront(String managerNationalIdFront) {
        this.managerNationalIdFront = managerNationalIdFront;
    }

    public String getManagerNationalIdBack() {
        return managerNationalIdBack;
    }

    public void setManagerNationalIdBack(String managerNationalIdBack) {
        this.managerNationalIdBack = managerNationalIdBack;
    }

    public String getBusinessLandLine() {
        return businessLandLine;
    }

    public void setBusinessLandLine(String businessLandLine) {
        this.businessLandLine = businessLandLine;
    }

    public String getContractArabianNumber() {
        return contractArabianNumber;
    }

    public void setContractArabianNumber(String contractArabianNumber) {
        this.contractArabianNumber = contractArabianNumber;
    }

    public String getContractSouthEastAsiaNumber() {
        return contractSouthEastAsiaNumber;
    }

    public void setContractSouthEastAsiaNumber(String contractSouthEastAsiaNumber) {
        this.contractSouthEastAsiaNumber = contractSouthEastAsiaNumber;
    }

    public String getContractSouthAsiaNumber() {
        return contractSouthAsiaNumber;
    }

    public void setContractSouthAsiaNumber(String contractSouthAsiaNumber) {
        this.contractSouthAsiaNumber = contractSouthAsiaNumber;
    }

    public String getContractNonArabianNumber() {
        return contractNonArabianNumber;
    }

    public void setContractNonArabianNumber(String contractNonArabianNumber) {
        this.contractNonArabianNumber = contractNonArabianNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getStateCode() {
        return stateCode;
    }

    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }

    public Boolean getIsDeveloper() {
        return isDeveloper;
    }

    public void setIsDeveloper(Boolean isDeveloper) {
        this.isDeveloper = isDeveloper;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



