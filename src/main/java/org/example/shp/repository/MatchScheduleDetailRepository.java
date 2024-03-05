package org.example.shp.repository;

import org.example.shp.domain.MatchScheduleDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchScheduleDetailRepository extends JpaRepository<MatchScheduleDetail, Long> {
    MatchScheduleDetail findByMatchScheduleId(Long matchScheduleId);
}
