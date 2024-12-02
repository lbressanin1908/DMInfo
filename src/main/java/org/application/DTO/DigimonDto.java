package org.application.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigimonDto {
    private int id;
    private String name;
    private Boolean xAntibody;

    @Override
    public String toString() {
        return "DigimonDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xAntibody=" + xAntibody +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getxAntibody() {
        return xAntibody;
    }

    public void setxAntibody(Boolean xAntibody) {
        this.xAntibody = xAntibody;
    }
}
