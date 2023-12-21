package com.johncena.pdfcreatortest.mapper;

import com.johncena.pdfcreatortest.entity.Magic;
import com.johncena.pdfcreatortest.model.MagicModel;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public MagicModel magicEntityToModel(Magic entity) {

        MagicModel model = new MagicModel();

        model.setId(entity.getId());
        model.setNumberTest(entity.getNumberTest());
        model.setRndmTextTest(entity.getRndmTextTest().toString());
        model.setDropDownTest(entity.getDropDownTest().toString());

        return model;
    }
}
