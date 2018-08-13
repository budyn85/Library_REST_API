package com.kodilla.restapilibrary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Component
public interface RentRepository extends CrudRepository<Rent, Long> {

    Optional<Rent> getRentById(Long Id);
}
