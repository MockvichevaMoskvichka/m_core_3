package com.example.m_core_1.repository;

import com.example.m_core_1.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

   User getById(Long id);

}
