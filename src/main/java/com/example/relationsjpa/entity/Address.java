package com.example.relationsjpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_ID", unique = true, nullable = false)
    private int id;

    @Column(name = "address_name", length = 40)
    String name;
    @Column(name = "address_zip", length = 10)
    int zip;

    String city;
}
