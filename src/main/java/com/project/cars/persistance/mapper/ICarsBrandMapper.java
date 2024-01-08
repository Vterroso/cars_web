package com.project.cars.persistance.mapper;

import com.project.cars.domain.pojo.CarsBrandPojo;
import com.project.cars.persistance.entities.CarsBrandEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
    * This interface is a mapper that maps the CarsBrandEntity class to the CarsBrandPojo class.
    * It is used to convert the CarsBrandEntity object to a CarsBrandPojo object.
 */
@Mapper(componentModel = "spring")
public interface ICarsBrandMapper {
    /**
        * This method is used to convert a CarsBrandEntity object to a CarsBrandPojo object.
        * @param brandEntity is the CarsBrandEntity object to be converted.
        * @return a CarsBrandPojo object.
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    CarsBrandPojo toCarsBrandPojo(CarsBrandEntity brandEntity);

    /**
        * This method is used to convert a CarsBrandPojo object to a CarsBrandEntity object.
        * @param brandPojo is the CarsBrandPojo object to be converted.
        * @return a CarsBrandEntity object.
     */
    @InheritInverseConfiguration
    CarsBrandEntity toCarsBrandEntity(CarsBrandPojo brandPojo);

    /**
        * This method is used to convert a list of CarsBrandEntity objects to a list of CarsBrandPojo objects.
        * @param brandEntityList is the list of CarsBrandEntity objects to be converted.
        * @return a list of CarsBrandPojo objects.
     */
    List<CarsBrandPojo> toCarsBrandPojo(List<CarsBrandEntity> brandEntityList);
}
