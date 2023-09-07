package org.danrusu.sfgpetclinic.services;

import org.danrusu.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by rusud on 06.09.2023
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
