package org.example.shp.model.request;

import lombok.Getter;
import lombok.Setter;
import org.example.shp.domain.MatchSchedule;
import org.example.shp.domain.MatchScheduleDetail;

import java.time.LocalDate;

@Getter
@Setter
public class SaveMatchScheduleRequest {
    private int seasonId;

    private int competitionId;

    private LocalDate matchDay;

    private int homeClubId;

    private int awayClubId;

    private String status;

    private String result;

    private int homeScore;

    private int awayScore;

    private int homeOccupancy;

    private int awayOccupancy;

    public MatchSchedule toMatchScheduleEntity() {
        return MatchSchedule.builder()
                .seasonId(seasonId)
                .competitionId(competitionId)
                .matchDay(matchDay)
                .homeClubId(homeClubId)
                .awayClubId(awayClubId)
                .status(status)
                .build();
    }

    public MatchScheduleDetail toMatchScheduleDetailEntity(Long id) {
        return MatchScheduleDetail.builder()
                .matchScheduleId(id)
                .result(result)
                .homeScore(homeScore)
                .awayScore(awayScore)
                .homeOccupancy(homeOccupancy)
                .awayOccupancy(awayOccupancy)
                .build();
    }
}
