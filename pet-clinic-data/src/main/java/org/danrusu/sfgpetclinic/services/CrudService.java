package org.danrusu.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by rusud on 07.09.2023
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
