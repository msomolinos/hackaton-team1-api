package net.pi.hackaton.core.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public enum CrimeRate {
    MAD_MAX("1", "Dangeous"),INSECURE("2", "Insecure"),FINE("3", "Fine"),SECURE("4", "Secure"),FORT_KNOX("5", "Very Secure");
    private String id;
    private String rateName;
    CrimeRate(String id, String rateName) {
        this.id = id;
        this.rateName = rateName;
    }

    public String id() {
        return id;
    }

    public String rateName() {
        return rateName;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("rateName", rateName).build();
    }
}
