package org.application.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.application.Model.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigimonDto {
    private int id;
    private String name;
    private Boolean xAntibody;
    private List<Image> imagens;
    private List<Level> levels;
    private List<Type> types;
    private List<Attribute> attributes;
    private List<Field> fields;
    private String RealeaseDate;
    private List<Description> descriptions;
    private List<Skill> skills;
    private List<Evolution>  priorEvolutions;
    private List<Evolution> nextEvolutions;

    @Override
    public String toString() {
        return "DigimonDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xAntibody=" + xAntibody +
                ", imagens=" + imagens +
                ", levels=" + levels +
                ", types=" + types +
                ", attributes=" + attributes +
                ", fields=" + fields +
                ", RealeaseDate='" + RealeaseDate + '\'' +
                ", descriptions=" + descriptions +
                ", skills=" + skills +
                ", priorEvolutions=" + priorEvolutions +
                ", nextEvolutions=" + nextEvolutions +
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

    public List<Image> getImagens() {
        return imagens;
    }

    public void setImagens(List<Image> imagens) {
        this.imagens = imagens;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public String getRealeaseDate() {
        return RealeaseDate;
    }

    public void setRealeaseDate(String realeaseDate) {
        RealeaseDate = realeaseDate;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Evolution> getPriorEvolutions() {
        return priorEvolutions;
    }

    public void setPriorEvolutions(List<Evolution> priorEvolutions) {
        this.priorEvolutions = priorEvolutions;
    }

    public List<Evolution> getNextEvolutions() {
        return nextEvolutions;
    }

    public void setNextEvolutions(List<Evolution> nextEvolutions) {
        this.nextEvolutions = nextEvolutions;
    }
}
