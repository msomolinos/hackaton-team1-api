package net.pi.hackaton.core.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Region {

    private String id;
    private String name;

    public Region() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).build();
    }
}
