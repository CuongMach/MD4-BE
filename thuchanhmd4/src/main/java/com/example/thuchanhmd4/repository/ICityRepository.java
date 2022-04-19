package com.example.thuchanhmd4.repository;

import com.example.thuchanhmd4.model.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends PagingAndSortingRepository<City,Long> {
}
