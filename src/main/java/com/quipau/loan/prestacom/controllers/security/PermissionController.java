package com.quipau.loan.prestacom.controllers.security;

import com.quipau.loan.prestacom.models.data.security.PermissionDto;
import com.quipau.loan.prestacom.orm.services.securities.PermissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api")
public class PermissionController {

    private final PermissionService service;

    public PermissionController(PermissionService service) {
        this.service = service;
    }

    @RequestMapping(value = "/permissions", method = RequestMethod.GET)
    public ResponseEntity<List<PermissionDto>> get(@RequestParam String page, @RequestParam String size, @RequestParam String filterValue) {
        List<PermissionDto> result = service.getAll(Integer.parseInt(page), Integer.parseInt(size), filterValue, true)
                .stream().map(PermissionDto::domainToDto).collect(Collectors.toList());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
