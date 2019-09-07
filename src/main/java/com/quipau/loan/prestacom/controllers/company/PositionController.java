package com.quipau.loan.prestacom.controllers.company;

import com.quipau.loan.prestacom.services.company.PositionService;
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

//    @RequestMapping(method = RequestMethod.GET)
//    public ResponseEntity<List<PositionDto>> get(@RequestParam String page, @RequestParam String size, @RequestParam String filterValue) {
//        long start = System.currentTimeMillis();
//        List<PositionDto> result = service.findAll(PageRequest.of(Integer.parseInt(page), Integer.parseInt(size)), "%" + filterValue + "%").stream().map(Position::toDto).collect(Collectors.toList());
//        System.out.println("Position Get Total Time: " + (System.currentTimeMillis() - start));
//        return new ResponseEntity<>(result, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/all", method = RequestMethod.GET)
//    public ResponseEntity<List<PositionDto>> getAll() {
//        long start = System.currentTimeMillis();
//        List<PositionDto> result = service.findAll().stream().map(Position::toDto).collect(Collectors.toList());
//        System.out.println("Branch Get Total Time: " + (System.currentTimeMillis() - start));
//        return new ResponseEntity<>(result, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = Urls.COUNT, method = RequestMethod.GET)
//    public ResponseEntity<Long> count(@RequestParam String filterValue) {
//        long start = System.currentTimeMillis();
//        Long result = service.count("%" + filterValue + "%");
//        System.out.println("Position Count Total Time: " + (System.currentTimeMillis() - start));
//        return new ResponseEntity<>(result, HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public ResponseEntity<PositionDto> update(@RequestBody PositionDto paramDto) {
//        long start = System.currentTimeMillis();
//        if (service.bootStrap(Position.toDomain(paramDto)) != null) {
//            return new ResponseEntity<>(HttpStatus.ACCEPTED);
//        }
//        System.out.println("Position Update Total Time: " + (System.currentTimeMillis() - start));
//        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public ResponseEntity<PositionDto> save(@RequestBody PositionDto dto) {
//        long start = System.currentTimeMillis();
//        if (service.bootStrap(Position.toDomain(dto)) != null) {
//            return new ResponseEntity<>(HttpStatus.CREATED);
//        }
//        System.out.println("Position Save Total Time: " + (System.currentTimeMillis() - start));
//        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE)
//    public ResponseEntity update(@RequestParam String id) {
//        long start = System.currentTimeMillis();
//        service.softDelete(Long.parseLong(id));
//        System.out.println("Position Delete Total Time: " + (System.currentTimeMillis() - start));
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
}
