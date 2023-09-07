package org.danrusu.sfgpetclinic.model;

/**
 * Created by rusud on 04.09.2023
 */
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
