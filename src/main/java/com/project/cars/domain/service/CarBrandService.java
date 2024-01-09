package com.project.cars.domain.service;

import com.project.cars.domain.pojo.CarBrandPojo;
import com.project.cars.domain.repository.ICarBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * This class is a service that implements the ICarBrandService interface.
 */
@RequiredArgsConstructor
@Service
public class CarBrandService implements ICarBrandService {

    /**
     * This attribute is used to access the database and perform CRUD operations.
     */
    private final ICarBrandRepository iCarBrandRepository;
    /**
     * This method is used to get all the cars brands.
     * @return a list of CarsBrandPojo objects.
     */
    @Override
    public List<CarBrandPojo> getAll() {
        return iCarBrandRepository.getAll();
    }
/**
     * This method is used to get a cars brand by its id.
     * @param id is the id of the cars brand to be searched.
     * @return a CarsBrandPojo object.
     */
    @Override
    public Optional<CarBrandPojo> getCarsBrand(Long id) {
        return iCarBrandRepository.getCarsBrand(id);
    }

    /**
     *
     * @param newCarsBrand is the CarsBrandPojo object to be saved.
     * @return a CarsBrandPojo object.
     */
    @Override
    public CarBrandPojo save(CarBrandPojo newCarsBrand) {
        return iCarBrandRepository.save(newCarsBrand);
    }
    /**
     * This method is used to delete a cars brand by its id.
     * @param idCarBrand is the id of the cars brand to be deleted.
     * @return a boolean value.
     */
    @Override
    public boolean delete(Long idCarBrand) {
        try {
            iCarBrandRepository.delete(idCarBrand);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
