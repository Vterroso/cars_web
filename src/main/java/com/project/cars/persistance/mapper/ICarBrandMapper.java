package com.project.cars.persistance.mapper;

import com.project.cars.domain.pojo.CarBrandPojo;
import com.project.cars.persistance.entities.CarBrandEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
    * This interface is a mapper that maps the CarBrandEntity class to the CarsBrandPojo class.
    * It is used to convert the CarBrandEntity object to a CarsBrandPojo object.
 */
@Mapper(componentModel = "spring")
public interface ICarBrandMapper {
    /**
        * This method is used to convert a CarBrandEntity object to a CarsBrandPojo object.
        * @param brandEntity is the CarBrandEntity object to be converted.
        * @return a CarsBrandPojo object.
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    CarBrandPojo toCarsBrandPojo(CarBrandEntity brandEntity);

    /**
        * This method is used to convert a CarsBrandPojo object to a CarBrandEntity object.
        * @param brandPojo is the CarsBrandPojo object to be converted.
        * @return a CarBrandEntity object.
     */
    @InheritInverseConfiguration
    CarBrandEntity toCarsBrandEntity(CarBrandPojo brandPojo);

    /**
     * This method is used to convert a list of CarBrandEntity objects to a list of CarsBrandPojo objects.
     *
     * @param brandEntityList is the list of CarBrandEntity objects to be converted.
     * @return a list of CarsBrandPojo objects.
     */
    static List<CarBrandPojo> toCarsBrandPojo(List<CarBrandEntity> brandEntityList) {
        return null;
    }
}
