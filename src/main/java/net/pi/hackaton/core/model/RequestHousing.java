package net.pi.hackaton.core.model;

import java.util.List;

public class RequestHousing {

    private Double budget;

    private List<String> crimeRate;

    private List<String> bedrooms;

    private List<String> regions;

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public List<String> getCrimeRate() {
        return crimeRate;
    }

    public void setCrimeRate(List<String> crimeRate) {
        this.crimeRate = crimeRate;
    }

    public List<String> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(List<String> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }
}
