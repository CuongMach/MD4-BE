package com.example.thuchanhmd4.controller;

import com.example.thuchanhmd4.model.City;
import com.example.thuchanhmd4.service.city.ICityService;
import com.example.thuchanhmd4.service.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private ICityService cityService;

    @GetMapping
    public ResponseEntity<Iterable<City>> findAll() {
        Iterable<City> cities = cityService.findAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> findById(@PathVariable Long id) {
        Optional<City> cityOptional = cityService.findById(id);
        if (!cityOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cityOptional.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<City> save(@RequestBody City city) {
        return new ResponseEntity<>(cityService.save(city), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<City> update(@PathVariable Long id,@RequestBody City newCity) {
        Optional<City> cityOptional = cityService.findById(id);
        if (!cityOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        newCity.setId(id);
        return new ResponseEntity<>(cityService.save(newCity), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<City> delete(@PathVariable Long id) {
        Optional<City> cityOptional = cityService.findById(id);
        if (!cityOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        cityService.removeById(id);
        return new ResponseEntity<>(cityOptional.get(), HttpStatus.OK);
    }


}
