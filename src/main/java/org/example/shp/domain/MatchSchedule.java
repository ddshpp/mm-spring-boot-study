package org.example.shp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "match_schedule")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "season_id")
    private int seasonId;

    @Column(name = "competition_id")
    private int competitionId;

    @Column(name = "matchday")
    private LocalDate matchDay;

    @Column(name = "home_club_id")
    private int homeClubId;

    @Column(name = "away_club_id")
    private int awayClubId;

    @Column(name = "status")
    private String status;

    //TODO : 0305(2) 여기에 업데이트 함수를 만들어서 써도 됨

}

