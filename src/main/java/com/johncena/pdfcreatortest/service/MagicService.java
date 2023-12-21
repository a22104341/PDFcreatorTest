package com.johncena.pdfcreatortest.service;

import com.johncena.pdfcreatortest.entity.Magic;
import com.johncena.pdfcreatortest.repository.MagicJpaRepository;
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
