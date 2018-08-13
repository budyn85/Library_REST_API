package com.kodilla.restapilibrary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Component
@Transactional
public interface ReaderRepository extends CrudRepository<Reader, Long> {

    Optional<Reader> getReaderById(Long readerId);
}