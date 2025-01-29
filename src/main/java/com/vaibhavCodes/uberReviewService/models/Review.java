package com.vaibhavCodes.uberReviewService.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Review {
    @Id             // This makes the Id Property as the Primary Key of our table.
    Long id;

}
