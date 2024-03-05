package org.example.shp.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "season")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "season")
    private String season;
}
