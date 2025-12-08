package com.Tanseeq.Tanseeq5.dto;

import java.util.List;

public class CompanyDto {
    public Long id;
    public String companyNumber;
    public String email;
    public String phone;
    public String logo;
    public String cover;
    public String dashboardName;
    public String dashboardSrc;

    public String managerFirstName;
    public String managerFirstNameLocalized;
    public String managerLastName;
    public String managerLastNameLocalized;
    public String managerNationalIdFront;
    public String managerNationalIdBack;

    public String businessLandLine;
    public String contractArabianNumber;
    public String contractSouthEastAsiaNumber;
    public String contractSouthAsiaNumber;
    public String contractNonArabianNumber;

    public String state;
    public Integer stateCode;
    public Boolean isDeveloper;
    public String color;
    public Integer zoneManagerId;

    public List<Long> squareIds;
    public List<Long> campIds;
    public List<Long> hypothesisIds;
}
