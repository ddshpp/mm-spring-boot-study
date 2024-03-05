package org.example.shp.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "goal_type")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoalType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;
}
