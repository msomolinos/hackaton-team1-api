package net.pi.hackaton.core.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by msomolinos on 14/12/16.
 */
public enum NumBeds {
    ONE_BED("1", "1 Bed"),
    TWO_BEDS("2", "2 Beds"),
    THREE_BEDS("3", "3 Beds"),
    MORE_BEDS("4+", "4+ Beds");

    private String beds;
    private String description;
    NumBeds(String beds, String description) {
        this.beds = beds;
        this.description = description;
    }
    public String beds() {
        return beds;
    }
    public String description() {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numBeds", beds).append("description", description).build();
    }
}
