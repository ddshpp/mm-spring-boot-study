package org.example.shp.repository;

import org.example.shp.domain.GoalBodyPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalBodyPartRepository extends JpaRepository<GoalBodyPart, Long> {
}
