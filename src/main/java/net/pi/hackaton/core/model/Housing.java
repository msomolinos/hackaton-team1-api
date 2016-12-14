package net.pi.hackaton.core.model;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Housing {
    private String id;
    private Region region;
    private NumBeds numBeds;
    private Integer year;
    private Double price;
    private CrimeRate crimeRate;

    public Housing() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public NumBeds getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(NumBeds numBeds) {
        this.numBeds = numBeds;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CrimeRate getCrimeRate() {
        return crimeRate;
    }

    public void setCrimeRate(CrimeRate crimeRate) {
        this.crimeRate = crimeRate;
    }

    @Override
    public String toString() {
        return (new ToStringBuilder(this))
                .append("id", id)
                .append("region", region)
                .append("numBeds", numBeds.toString())
                .append("crimeRate", crimeRate)
                .append("year", year)
                .append("price", price).build();
    }
}
