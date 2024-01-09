package com.project.cars.controller;

import com.project.cars.domain.pojo.CarBrandPojo;
import com.project.cars.domain.service.ICarBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class is a controller that handles the requests for the car-brand resource.
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/car-brand")
public class CarBrandController {
    /**
     * This attribute is used to access the service layer and perform CRUD operations.
     */
    private final ICarBrandService iCarBrandService;

    /**
     * This method is used to get all the cars brands.
     * @return a list of CarsBrandPojo objects.
     */
    @GetMapping("/car-brand/all")
    public ResponseEntity<List<CarBrandPojo>> getAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(iCarBrandService.getAll());
    }

    /**
     * This method is used to get a cars brand by its id.
     * @param id is the id of the cars brand to be searched.
     * @return a CarsBrandPojo object.
     */
    @GetMapping("/car-brand/{id}")
    public ResponseEntity<CarBrandPojo> getCarsBrand(Long id) {
        return ResponseEntity.of(iCarBrandService.getCarsBrand(id));
    }
    /**
     * This method is used to save a cars brand.
     * @param newCarsBrandPojo is the CarsBrandPojo object to be saved.
     * @return a CarsBrandPojo object.
     */
    @PostMapping("/car-brand/save")
    public ResponseEntity<CarBrandPojo> save(@RequestBody CarBrandPojo newCarsBrandPojo) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iCarBrandService.save(newCarsBrandPojo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .build();
        }
    }
}
