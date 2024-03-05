package org.example.shp.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "score_record")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "match_schedule_id")
    private Long matchScheduleId;

    @Column(name = "time")
    private int time;

    @Column(name = "time_classification_id")
    private Long timeClassificationId;

    @Column(name = "goal_player_detail_id")
    private Long goalPlayerDetailId;

    @Column(name = "assist_player_detail_id")
    private Long assistPlayerDetailId;

    @Column(name = "goal_type_id")
    private Long goalTypeId;

    @Column(name = "goal_body_part_id")
    private Long goalBodyPartId;
}
