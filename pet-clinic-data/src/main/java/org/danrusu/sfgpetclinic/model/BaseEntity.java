package org.danrusu.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by rusud on 07.09.2023
 */
public class BaseEntity implements Serializable {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
