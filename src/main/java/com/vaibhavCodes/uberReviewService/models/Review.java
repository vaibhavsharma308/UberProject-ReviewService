package com.vaibhavCodes.uberReviewService.models;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="booking_review")
public class Review {
    @Id             // This makes the Id Property as the Primary Key of our table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Auto Increment
   private Long id;

    @Column(nullable = false)
   private String content;

   private double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(nullable = false)
    private Date updatedAt;
}

//Allow Spring to do this
// new Review(content,rating)