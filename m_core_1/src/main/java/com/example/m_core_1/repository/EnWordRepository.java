package com.example.m_core_1.repository;

import com.example.m_core_1.model.EnWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnWordRepository extends CrudRepository<EnWord, Long> {
    EnWord getById(Long id);
}
