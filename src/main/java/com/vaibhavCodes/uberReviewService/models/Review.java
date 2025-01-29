package com.vaibhavCodes.uberReviewService.models;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@Entity
@Table(name="booking_review")
public class Review {
    @Id             // This makes the Id Property as the Primary Key of our table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Auto Increment
    Long id;

    @Column(nullable = false)
    String content;

    double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(nullable = false)
    Date updatedAt;
}

//Allow Spring to do this
// new Review(content,rating)