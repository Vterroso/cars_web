package com.project.cars.domain.service;

import com.project.cars.domain.pojo.CarBrandPojo;

import java.util.List;
import java.util.Optional;

public interface ICarBrandService {
    /**
     * This method is used to get all the cars brands.
     * @return a list of CarsBrandPojo objects.
     */
    List<CarBrandPojo> getAll();

    /**
     * This method is used to get a cars brand by its id.
     * @param id is the id of the cars brand to be searched.
     * @return a CarsBrandPojo object.
     */
    Optional<CarBrandPojo> getCarsBrand(Long id);

    /**
     * This method is used to save a cars brand.
     * @param carsBrandPojo is the CarsBrandPojo object to be saved.
     * @return a CarsBrandPojo object.
     */
    CarBrandPojo save(CarBrandPojo carsBrandPojo);

    /**
     * This method is used to delete a cars brand by its id.
     * @param id is the id of the cars brand to be deleted.
     */
    boolean delete(Long id);
}

