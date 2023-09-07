package org.danrusu.sfgpetclinic.services;

import org.danrusu.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by rusud on 06.09.2023
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
