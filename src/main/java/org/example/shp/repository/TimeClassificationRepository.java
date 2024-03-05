package org.example.shp.repository;

import org.example.shp.domain.TimeClassification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeClassificationRepository extends JpaRepository<TimeClassification, Long> {
}
