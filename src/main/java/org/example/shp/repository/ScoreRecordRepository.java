package org.example.shp.repository;

import org.example.shp.domain.ScoreRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRecordRepository extends JpaRepository<ScoreRecord, Long> {
}
