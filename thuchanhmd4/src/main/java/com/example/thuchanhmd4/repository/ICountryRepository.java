package com.example.thuchanhmd4.repository;


import com.example.thuchanhmd4.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends PagingAndSortingRepository<Country, Long> {
}

