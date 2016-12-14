package net.pi.hackaton.core.model;


public class Housing {
    private String id;
    private Region region;
    private Double longitude;
    private Double latitude;
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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
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
