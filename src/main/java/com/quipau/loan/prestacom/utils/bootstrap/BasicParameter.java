package com.quipau.loan.prestacom.utils.bootstrap;

import com.quipau.loan.prestacom.models.interfaces.BootStrapInsert;
import com.quipau.loan.prestacom.orm.domains.securities.Parameter;
import com.quipau.loan.prestacom.services.securities.ParameterService;
import com.quipau.loan.prestacom.utils.security.SystemParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BasicParameter implements BootStrapInsert {

    private final ParameterService service;

    @Autowired
    public BasicParameter(ParameterService service) {
        this.service = service;
    }

    @Override
    public void insert() {
        for (Integer code : SystemParameters.getValues()) {
            Optional<Parameter> optional = service.findByCode(code);
            if (optional.isEmpty()) {
                Parameter param = new Parameter();
                param.setCode(code);
                param.setName(SystemParameters.name(code));
                param.setDescription(SystemParameters.description(code));
                param.setValue(SystemParameters.value(code));
                param.setChangeRoot(SystemParameters.changeRoot(code));
                service.save(param);
            }
        }
    }
}
