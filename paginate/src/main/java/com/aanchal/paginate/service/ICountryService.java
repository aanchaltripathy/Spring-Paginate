package com.aanchal.paginate.service;



import com.aanchal.paginate.model.*;
import java.util.List;

public interface ICountryService {

    List<Country> findPaginated(int pageNo, int pageSize);
}
