package com.johnCena.PDFcreatorTest.mapper;

import com.johnCena.PDFcreatorTest.entity.Magic;
import com.johnCena.PDFcreatorTest.model.MagicModel;
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
