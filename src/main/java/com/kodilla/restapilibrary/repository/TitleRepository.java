package com.kodilla.restapilibrary.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

@Component
@Transactional
public interface TitleRepository extends CrudRepository<Title, Long> {

    Optional<Title> getTitleById(Long titleId);

    @Query(nativeQuery = true)
    List<Title> getAllTitles();
}
