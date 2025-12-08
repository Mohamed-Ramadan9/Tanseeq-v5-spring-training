package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "squares")
public class Square extends BaseEntity {
    private String squareNumber;
    private Integer FID;
    private Double shapeArea;
    private Double shapeLength;
    private Double area;
    private String globalID;

    @OneToMany(mappedBy = "square", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Camp> camp = new ArrayList<>();

    public Square() {}

    public String getSquareNumber() { return squareNumber; }
    public void setSquareNumber(String squareNumber) { this.squareNumber = squareNumber; }

    public Integer getFID() { return FID; }
    public void setFID(Integer FID) { this.FID = FID; }

    public Double getShapeArea() { return shapeArea; }
    public void setShapeArea(Double shapeArea) { this.shapeArea = shapeArea; }

    public Double getShapeLength() { return shapeLength; }
    public void setShapeLength(Double shapeLength) { this.shapeLength = shapeLength; }

    public Double getArea() { return area; }
    public void setArea(Double area) { this.area = area; }

    public String getGlobalID() { return globalID; }
    public void setGlobalID(String globalID) { this.globalID = globalID; }

    public List<Camp> getCamp() { return camp; }
    public void setCamp(List<Camp> camp) { this.camp = camp; }
}
