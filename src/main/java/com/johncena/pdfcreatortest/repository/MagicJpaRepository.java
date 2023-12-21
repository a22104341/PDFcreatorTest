package com.johncena.pdfcreatortest.repository;


import com.johncena.pdfcreatortest.entity.Magic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MagicJpaRepository extends JpaRepository<Magic, Long> {

}
