package com.project.cars.persistance.repository;

import com.project.cars.domain.pojo.CarBrandPojo;
import com.project.cars.domain.repository.ICarBrandRepository;
import com.project.cars.persistance.entities.CarBrandEntity;
import com.project.cars.persistance.mapper.ICarBrandMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * This class is a repository that implements the ICarBrandRepository interface.
 */
@RequiredArgsConstructor
@Repository
public class CarBrandRepository implements ICarBrandRepository {

    /**
     * This attribute is used to access the database and perform CRUD operations.
     */
    private final ICarBrandCrudRepository iCarBrandCrudRepository;
    /**
     * This attribute is used to map the CarBrandEntity class to the CarsBrandPojo class.
     */
    private final ICarBrandMapper iCarBrandMapper;

    /**
     * This method is used to get all the cars brands.
     * @return a list of CarsBrandPojo objects.
     */
    @Override
    public List<CarBrandPojo> getAll() {
        return ICarBrandMapper.toCarsBrandPojo(iCarBrandCrudRepository.findAll());
    }
    /**
     * This method is used to get a cars brand by its id.
     * @param id is the id of the cars brand to be searched.
     * @return a CarsBrandPojo object.
     */
    @Override
    public Optional<CarBrandPojo> getCarsBrand(Long id) {
        return iCarBrandCrudRepository.findById(id)
                .map(iCarBrandMapper::toCarsBrandPojo);
    }
    /**
     * This method is used to save a cars brand.
     * @param newCarsBrand is the CarsBrandPojo object to be saved.
     * @return a CarsBrandPojo object.
     */
    @Override
    public CarBrandPojo save(CarBrandPojo newCarsBrand) {
        CarBrandEntity carsBrandEntity = iCarBrandMapper.toCarsBrandEntity(newCarsBrand);
        return iCarBrandMapper.toCarsBrandPojo(iCarBrandCrudRepository.save(carsBrandEntity));
    }
    /**
     * This method is used to delete a cars brand by its id.
     * @param idCarBrand is the id of the cars brand to be deleted.
     */
    @Override
    public void delete(Long idCarBrand) {
        iCarBrandCrudRepository.deleteById(idCarBrand);
    }
}
