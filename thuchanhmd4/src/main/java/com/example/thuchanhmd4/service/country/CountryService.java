package com.example.thuchanhmd4.service.country;

import com.example.thuchanhmd4.model.Country;
import com.example.thuchanhmd4.repository.ICountryRepository;
import com.example.thuchanhmd4.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CountryService implements ICountryService {


    @Autowired
    private ICountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }


    @Override
    public Optional<Country> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Country save(Country country) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
