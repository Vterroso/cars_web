package com.project.cars.persistance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/*
    * This class is an entity that represents the cars_brand table in the database.
 */
@Getter
@Setter
@Entity
@Table(name = "cars_brand")
public class CarBrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;
}
