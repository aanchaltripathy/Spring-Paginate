package com.aanchal.paginate.repository;



import com.aanchal.paginate.model.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}