package com.johnCena.PDFcreatorTest.repository;


import com.johnCena.PDFcreatorTest.entity.Magic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MagicJpaRepository extends JpaRepository<Magic, Long> {

}
