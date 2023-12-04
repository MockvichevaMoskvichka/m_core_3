package com.example.m_core_1.services;

import com.example.m_core_1.model.User;
import com.example.m_core_1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User getUser(Long id){

        return userRepository.getById(id);

    }
}
