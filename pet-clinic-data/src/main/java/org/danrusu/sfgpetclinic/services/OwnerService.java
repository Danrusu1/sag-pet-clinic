package org.danrusu.sfgpetclinic.services;

import org.danrusu.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by rusud on 06.09.2023
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
