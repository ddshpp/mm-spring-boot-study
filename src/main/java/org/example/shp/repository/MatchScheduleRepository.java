package org.example.shp.repository;

import org.example.shp.domain.MatchSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchScheduleRepository extends JpaRepository<MatchSchedule, Long> {

    MatchSchedule findOneById(Long matchScheduleId);
}
