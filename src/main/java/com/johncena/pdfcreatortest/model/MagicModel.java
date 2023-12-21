package com.johncena.pdfcreatortest.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MagicModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;

    @NotEmpty(message = "This field can't be empty")
    private long numberTest;

    @NotEmpty(message = "rndmText is mandatory!")
    @Size(min=1, max=256, message = "rndmText needs to be between 1 and 256 chars.")
    private String rndmTextTest;

    @NotEmpty(message = "picking and option is mandatory")
    private String dropDownTest;
}
