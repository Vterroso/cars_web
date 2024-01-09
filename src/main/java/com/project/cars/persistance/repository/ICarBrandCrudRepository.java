package com.project.cars.persistance.repository;

import com.project.cars.persistance.entities.CarBrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarBrandCrudRepository extends JpaRepository<CarBrandEntity, Long> {

}
