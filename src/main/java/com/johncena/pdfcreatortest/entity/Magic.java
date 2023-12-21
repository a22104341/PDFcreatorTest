package com.johncena.pdfcreatortest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "magic")
public class Magic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "numberTest", nullable = false)
    private Long numberTest; // Make sure this is Long if it's a nullable field

    @Column(name = "rndmTextTest", nullable = false)
    private String rndmTextTest;

    @Column(name = "dropDownTest", nullable = false)
    private String dropDownTest;
}
