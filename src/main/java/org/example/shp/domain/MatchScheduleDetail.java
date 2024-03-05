package org.example.shp.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "match_schedule_detail")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchScheduleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "match_schedule_id")
    private Long matchScheduleId;

    @Column(name = "result")
    private String result;

    @Column(name = "home_score")
    private int homeScore;

    @Column(name = "away_score")
    private int awayScore;

    @Column(name = "home_occupancy")
    private int homeOccupancy;

    @Column(name = "away_occupancy")
    private int awayOccupancy;
}
