package com.example.m_core_1.services;

import com.example.m_core_1.model.EnWord;
import com.example.m_core_1.repository.EnWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService{
    private final EnWordRepository enWordRepository;
    @Override
    public EnWord getEnWord(Long id){
        return enWordRepository.getById(id);

    }
}
