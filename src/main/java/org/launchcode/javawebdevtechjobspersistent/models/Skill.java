package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required")
    @Size(min = 3,max = 50,message = "Description must be between 3 and 50 characters.")
    private String description;

    public Skill (String location) {
        this.description = location;
    }

    public Skill() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String location) {
        this.description = location;
    }

}