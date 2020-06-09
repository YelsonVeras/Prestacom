package com.quipau.loan.prestacom.controllers.company;

import com.quipau.loan.prestacom.orm.services.company.PositionService;
import com.quipau.loan.prestacom.utils.Urls;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Urls.APP_POSITION)
public class PositionController {

    private final PositionService service;

    public PositionController(PositionService service) {
        this.service = service;
    }
}
