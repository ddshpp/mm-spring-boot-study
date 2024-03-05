package org.example.shp.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "competition")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
