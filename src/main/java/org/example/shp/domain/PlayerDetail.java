package org.example.shp.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player_detail")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "club_id")
    private Long clubId;
}
