package com.johnCena.PDFcreatorTest.service;

import com.johnCena.PDFcreatorTest.entity.Magic;
import com.johnCena.PDFcreatorTest.repository.MagicJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MagicService {
    private final MagicJpaRepository magicJpaRepository;

    public MagicService(MagicJpaRepository magicJpaRepository){
        this.magicJpaRepository = magicJpaRepository;
    }

    public void saveMagic(Magic magic) {
        magicJpaRepository.save(magic);
    }
}
